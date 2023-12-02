package com.marina.nkmarina.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import io.jaegertracing.internal.JaegerTracer;
import io.jaegertracing.internal.samplers.ConstSampler;
//import io.jaegertracing.internal.samplers.RateLimitingSampler;
import io.jaegertracing.Configuration.SamplerConfiguration;
import io.jaegertracing.Configuration.ReporterConfiguration;
import io.jaegertracing.Configuration.SenderConfiguration;

@Configuration
public class JaegerConfig {
	
	
	@Bean
    public JaegerTracer jaegerTracer(){
        //ATENÇÃO: nunca faça isso em produção
        var sampler = new SamplerConfiguration()
            .withType(ConstSampler.TYPE)
            .withParam(1);
        /*var sampler = new SamplerConfiguration()
            .withType(RateLimitingSampler.TYPE)
            .withParam(10);*/

        var reporter = new ReporterConfiguration()
            .withLogSpans(true)
            .withFlushInterval(1)
            .withSender(
                new SenderConfiguration()
                    .withAgentHost("192.168.1.9")
            );

        return new io.jaegertracing
            .Configuration("nkmarina")
            .withSampler(sampler)
            .withReporter(reporter)
            .getTracer();
    }
	
	
	

}
