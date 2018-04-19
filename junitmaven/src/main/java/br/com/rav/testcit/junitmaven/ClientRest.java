package br.com.rav.testcit.junitmaven;

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

public class ClientRest {
  private static final String END_POINT =
      "http://webhomol.hermespardini.com.br:9085/ihpcoresecurityws/rest/";

  public void obterUsuarioPorSigla() {

    final Client cliente = ClientBuilder.newClient();
    final WebTarget endPoint = cliente.target(END_POINT);
    final WebTarget recurso = endPoint.path("seguranca/obterusuario");

    recurso.queryParam("siglaUsuario", "RAV");

    final Invocation.Builder requisicao = recurso.request(MediaType.APPLICATION_JSON);
    final Response resposta = requisicao.get();

  }

  public Convenio obterConvenioPorId(Convenio parConvenio) throws Exception {

    final String wsEndPoint = "http://172.19.111.60:8080/ihpsecurityws/rest/convenios/getbylogin";

    final ObjectMapper mapper = new ObjectMapper();
    final String jsonToSend = mapper.writeValueAsString(parConvenio);

    final StringEntity strEntity = new StringEntity(jsonToSend);
    strEntity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));

    final HttpClient httpClient = HttpClientBuilder.create().build();
    final HttpPost postMethod = new HttpPost(wsEndPoint);
    postMethod.setEntity(strEntity);
    final HttpResponse response = httpClient.execute(postMethod);
    final String jsonData = EntityUtils.toString(response.getEntity());

    Convenio convRetorno = mapper.readValue(jsonData, new TypeReference<Convenio>() {});
    return convRetorno;
  }

}
