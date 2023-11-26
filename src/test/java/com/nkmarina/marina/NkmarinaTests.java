package com.marina.nkmarina;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marina.nkmarina.domain.Cliente;
//import com.marina.nkmarina.domain.Embarcacao;
import com.marina.nkmarina.resource.ClienteResource;
import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@SpringBootTest (classes = {com.marina.nkmarina.CursomcApplication.class},
properties = {"spring.jpa.database-platform=org.hibernate.dialect.H2Dialect",
			  "spring.datasource.driver-class-name=org.h2.Driver",
			  "spring.datasource.url=jdbc:h2:file:~/testjunit;DB_CLOSE_DELAY=-1;MODE=MYSQL",
			  "spring.jpa.hibernate.ddl-auto=create-drop"})
@AutoConfigureMockMvc
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
class NkmarinaTests {

	@Autowired
	private ClienteResource clienteResource;
	@Autowired
	private MockMvc mockMvc;
	private ObjectMapper mapper = new ObjectMapper();

	@Test
	void contextLoads() {
		assertThat(clienteResource).isNotNull();
	}
	@Test
	void testeClientesGET200() throws Exception{
		mockMvc.perform(get("/api/clientes"))
			.andExpect(status().isCreated());
	}
	@Test
	void testeClientesGETRetornoVazio() throws Exception{
		mockMvc.perform(get("/api/clientes"))
				.andExpect(status().isCreated())
				.andExpect(content().contentTypeCompatibleWith(new MediaType("application", "*+json")))
				.andExpect(jsonPath("$").isEmpty());
	}
	@Test
	void testeClientesPOSTGET200Retorno() throws Exception{
		var umCliente = new Cliente();
		umCliente.setNm_cliente("Zezinho");
		umCliente.setEmail_cliente("ze@ze.com.br");
		
		/*var umaEmbarcacao = new Embarcacao();
		umaEmbarcacao.setNm_embarc("Bateau Mouche");
		umCliente.getEmbarcacoes().add(umaEmbarcacao);*/

		var json = mapper.writeValueAsString(umCliente);
		
		mockMvc.perform(post("/api/clientes")
						.contentType(MediaType.APPLICATION_JSON)
						.content(json))
				.andExpect(status().isCreated());

		mockMvc.perform(get("/api/clientes"))
				.andExpect(status().isCreated())
				.andExpect(content().contentTypeCompatibleWith(new MediaType("application", "*+json")))
				.andExpect(jsonPath("$[0].nm_cliente", is("Zezinho")));
	}

	
	

}
