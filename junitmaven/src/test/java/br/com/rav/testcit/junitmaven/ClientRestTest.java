package br.com.rav.testcit.junitmaven;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class ClientRestTest {

  @Test
  public void testObterUsuarioPorSigla() {

    final Client cliente = ClientBuilder.newClient();
    final WebTarget endPoint = cliente.target("http://webhomol.hermespardini.com.br:9085/ihpcoresecurityws/rest/");
    final WebTarget recurso = endPoint.path("seguranca/obterusuario");

    recurso.queryParam("siglaUsuario", "ZUNGA");

    final Invocation.Builder requisicao = recurso.request(MediaType.APPLICATION_JSON);
    final Response resposta = requisicao.get();
    assertEquals(resposta.getStatus(), Response.Status.OK.getStatusCode());

  }

  @Test
  public void testObterConvenioPorId() throws Exception {

    final Convenio locConvenio = new Convenio();
    locConvenio.setId(6408L);
    locConvenio.setSenha(2449);
    ClientRest clientRest = new ClientRest();
    Convenio convRetorno = clientRest.obterConvenioPorId(locConvenio);
    assertEquals(convRetorno.getId(), locConvenio.getId());
  }
}
