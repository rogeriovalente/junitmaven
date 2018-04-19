package br.com.rav.testcit.junitmaven;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class Convenio  implements Serializable {

  private static final long serialVersionUID = 1L;
  private Long id;

  private Integer codigoConvenio;

  private Long cpf;

  private Date dataUltimoExame;

  private String nome;

  private String razaoSocial;

  private String tipoPagamento;

  private Integer senha;

  private String email;

  private String acumulaGratuidade;

  private String alteraSenha;

  private String bairro;

  private String bairroFaturamento;

  private String bloqueioInternet;

  private String bloqueiaDesconto;

  private String bloqueioFinanceiro;

  private String bloqueioImpressao;

  private String categoria;

  private String cep;

  private Integer cepFaturamento;

  private String cidade;

  private String cidadeFaturamento;

  private String classe;

  private String clienteVip;

  private String cnpj;

  private Integer codigoMatriz;

  private Integer codigoSuframa;

  private String complemento;

  private String contratos;

  private String criterioMelhorScore;

  private Timestamp dataAtualiza;

  private Date dataBloqueio;

  private Date dataCadastro;

  private Date dataUltimaAtualizacaoEndereco;

  private Date dataUltimaReativacao;

  private String endereco;

  private String enderecoFaturamento;

  private String formaPagamentoErp;

  private String inscricaoEstadual;

  private String inscricaoMunicipal;

  private String logoLaudo;

  private String medicinaDiagnostica;

  private String motivoCancelamento;

  private String nfMatriz;

  private String numero;

  private String optanteSimples;

  private String orgaoFederal;

  private String orgaoPublico;

  private String origem;

  private String origemAtualiza;

  private String pais;

  private String paisFaturamento;

  private Integer regiaoProdutiva;

  private String representante;

  private String responsavel;

  private String responsavelCancelamento;

  private String resultadoViaInternet;

  private String rmbh;

  private String rua;

  private String scoreCliente;

  private String situacao;

  private String tabelaPreco;

  private String tabelaPromo;

  private String tabelaVeterinaria;

  private String telefone;

  private String tipoCliente;

  private Integer tipoRua;

  private String uf;

  private String ufFaturamento;

  private String ultimaOperacao;

  private String usoVeterinaria;

  private String usuarioAtualiza;

  private String clienteExclusivoLicitacao;

  private String preCadastroDna;

  private String usaApplet;

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Convenio)) {
      return false;
    }
    final Convenio other = (Convenio) obj;
    if (id != null) {
      if (!id.equals(other.id)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (id == null ? 0 : id.hashCode());
    return result;
  }

  @Override
  public String toString() {
    String result = getClass().getSimpleName() + " ";
    if (codigoConvenio != null) {
      result += "codigoConvenio: " + codigoConvenio;
    }
    if (cpf != null) {
      result += ", cpf: " + cpf;
    }
    if (nome != null && !nome.trim().isEmpty()) {
      result += ", nome: " + nome;
    }
    if (razaoSocial != null && !razaoSocial.trim().isEmpty()) {
      result += ", razaoSocial: " + razaoSocial;
    }
    if (tipoPagamento != null && !tipoPagamento.trim().isEmpty()) {
      result += ", tipoPagamento: " + tipoPagamento;
    }
    if (senha != null) {
      result += ", senha: " + senha;
    }
    if (email != null && !email.trim().isEmpty()) {
      result += ", email: " + email;
    }
    return result;
  }

  public final Long getId() {
    return id;
  }

  public final void setId(final Long parId) {
    id = parId;
  }

  public final Integer getCodigoConvenio() {
    return codigoConvenio;
  }

  public final void setCodigoConvenio(final Integer parCodigoConvenio) {
    codigoConvenio = parCodigoConvenio;
  }

  public final Long getCpf() {
    return cpf;
  }

  public final void setCpf(final Long parCpf) {
    cpf = parCpf;
  }

  public final Date getDataUltimoExame() {
    return dataUltimoExame;
  }

  public final void setDataUltimoExame(final Date parDataUltimoExame) {
    dataUltimoExame = parDataUltimoExame;
  }

  public final String getNome() {
    return nome;
  }

  public final void setNome(final String parNome) {
    nome = parNome;
  }

  public final String getRazaoSocial() {
    return razaoSocial;
  }

  public final void setRazaoSocial(final String parRazaoSocial) {
    razaoSocial = parRazaoSocial;
  }

  public final String getTipoPagamento() {
    return tipoPagamento;
  }

  public final void setTipoPagamento(final String parTipoPagamento) {
    tipoPagamento = parTipoPagamento;
  }

  public final Integer getSenha() {
    return senha;
  }

  public final void setSenha(final Integer parSenha) {
    senha = parSenha;
  }

  public final String getEmail() {
    return email;
  }

  public final void setEmail(final String parEmail) {
    email = parEmail;
  }

  public final String getAcumulaGratuidade() {
    return acumulaGratuidade;
  }

  public final void setAcumulaGratuidade(final String parAcumulaGratuidade) {
    acumulaGratuidade = parAcumulaGratuidade;
  }

  public final String getAlteraSenha() {
    return alteraSenha;
  }

  public final void setAlteraSenha(final String parAlteraSenha) {
    alteraSenha = parAlteraSenha;
  }

  public final String getBairro() {
    return bairro;
  }

  public final void setBairro(final String parBairro) {
    bairro = parBairro;
  }

  public final String getBairroFaturamento() {
    return bairroFaturamento;
  }

  public final void setBairroFaturamento(final String parBairroFaturamento) {
    bairroFaturamento = parBairroFaturamento;
  }

  public final String getBloqueioInternet() {
    return bloqueioInternet;
  }

  public final void setBloqueioInternet(final String parBloqueioInternet) {
    bloqueioInternet = parBloqueioInternet;
  }

  public final String getBloqueiaDesconto() {
    return bloqueiaDesconto;
  }

  public final void setBloqueiaDesconto(final String parBloqueiaDesconto) {
    bloqueiaDesconto = parBloqueiaDesconto;
  }

  public final String getBloqueioFinanceiro() {
    return bloqueioFinanceiro;
  }

  public final void setBloqueioFinanceiro(final String parBloqueioFinanceiro) {
    bloqueioFinanceiro = parBloqueioFinanceiro;
  }

  public final String getBloqueioImpressao() {
    return bloqueioImpressao;
  }

  public final void setBloqueioImpressao(final String parBloqueioImpressao) {
    bloqueioImpressao = parBloqueioImpressao;
  }

  public final String getCategoria() {
    return categoria;
  }

  public final void setCategoria(final String parCategoria) {
    categoria = parCategoria;
  }

  public final String getCep() {
    return cep;
  }

  public final void setCep(final String parCep) {
    cep = parCep;
  }

  public final Integer getCepFaturamento() {
    return cepFaturamento;
  }

  public final void setCepFaturamento(final Integer parCepFaturamento) {
    cepFaturamento = parCepFaturamento;
  }

  public final String getCidade() {
    return cidade;
  }

  public final void setCidade(final String parCidade) {
    cidade = parCidade;
  }

  public final String getCidadeFaturamento() {
    return cidadeFaturamento;
  }

  public final void setCidadeFaturamento(final String parCidadeFaturamento) {
    cidadeFaturamento = parCidadeFaturamento;
  }

  public final String getClasse() {
    return classe;
  }

  public final void setClasse(final String parClasse) {
    classe = parClasse;
  }

  public final String getClienteVip() {
    return clienteVip;
  }

  public final void setClienteVip(final String parClienteVip) {
    clienteVip = parClienteVip;
  }

  public final String getCnpj() {
    return cnpj;
  }

  public final void setCnpj(final String parCnpj) {
    cnpj = parCnpj;
  }

  public final Integer getCodigoMatriz() {
    return codigoMatriz;
  }

  public final void setCodigoMatriz(final Integer parCodigoMatriz) {
    codigoMatriz = parCodigoMatriz;
  }

  public final Integer getCodigoSuframa() {
    return codigoSuframa;
  }

  public final void setCodigoSuframa(final Integer parCodigoSuframa) {
    codigoSuframa = parCodigoSuframa;
  }

  public final String getComplemento() {
    return complemento;
  }

  public final void setComplemento(final String parComplemento) {
    complemento = parComplemento;
  }

  public final String getContratos() {
    return contratos;
  }

  public final void setContratos(final String parContratos) {
    contratos = parContratos;
  }

  public final String getCriterioMelhorScore() {
    return criterioMelhorScore;
  }

  public final void setCriterioMelhorScore(final String parCriterioMelhorScore) {
    criterioMelhorScore = parCriterioMelhorScore;
  }

  public final Timestamp getDataAtualiza() {
    return dataAtualiza;
  }

  public final void setDataAtualiza(final Timestamp parDataAtualiza) {
    dataAtualiza = parDataAtualiza;
  }

  public final Date getDataBloqueio() {
    return dataBloqueio;
  }

  public final void setDataBloqueio(final Date parDataBloqueio) {
    dataBloqueio = parDataBloqueio;
  }

  public final Date getDataCadastro() {
    return dataCadastro;
  }

  public final void setDataCadastro(final Date parDataCadastro) {
    dataCadastro = parDataCadastro;
  }

  public final Date getDataUltimaAtualizacaoEndereco() {
    return dataUltimaAtualizacaoEndereco;
  }

  public final void setDataUltimaAtualizacaoEndereco(final Date parDataUltimaAtualizacaoEndereco) {
    dataUltimaAtualizacaoEndereco = parDataUltimaAtualizacaoEndereco;
  }

  public final Date getDataUltimaReativacao() {
    return dataUltimaReativacao;
  }

  public final void setDataUltimaReativacao(final Date parDataUltimaReativacao) {
    dataUltimaReativacao = parDataUltimaReativacao;
  }

  public final String getEndereco() {
    return endereco;
  }

  public final void setEndereco(final String parEndereco) {
    endereco = parEndereco;
  }

  public final String getEnderecoFaturamento() {
    return enderecoFaturamento;
  }

  public final void setEnderecoFaturamento(final String parEnderecoFaturamento) {
    enderecoFaturamento = parEnderecoFaturamento;
  }

  public final String getFormaPagamentoErp() {
    return formaPagamentoErp;
  }

  public final void setFormaPagamentoErp(final String parFormaPagamentoErp) {
    formaPagamentoErp = parFormaPagamentoErp;
  }

  public final String getInscricaoEstadual() {
    return inscricaoEstadual;
  }

  public final void setInscricaoEstadual(final String parInscricaoEstadual) {
    inscricaoEstadual = parInscricaoEstadual;
  }

  public final String getInscricaoMunicipal() {
    return inscricaoMunicipal;
  }

  public final void setInscricaoMunicipal(final String parInscricaoMunicipal) {
    inscricaoMunicipal = parInscricaoMunicipal;
  }

  public final String getLogoLaudo() {
    return logoLaudo;
  }

  public final void setLogoLaudo(final String parLogoLaudo) {
    logoLaudo = parLogoLaudo;
  }

  public final String getMedicinaDiagnostica() {
    return medicinaDiagnostica;
  }

  public final void setMedicinaDiagnostica(final String parMedicinaDiagnostica) {
    medicinaDiagnostica = parMedicinaDiagnostica;
  }

  public final String getMotivoCancelamento() {
    return motivoCancelamento;
  }

  public final void setMotivoCancelamento(final String parMotivoCancelamento) {
    motivoCancelamento = parMotivoCancelamento;
  }

  public final String getNfMatriz() {
    return nfMatriz;
  }

  public final void setNfMatriz(final String parNfMatriz) {
    nfMatriz = parNfMatriz;
  }

  public final String getNumero() {
    return numero;
  }

  public final void setNumero(final String parNumero) {
    numero = parNumero;
  }

  public final String getOptanteSimples() {
    return optanteSimples;
  }

  public final void setOptanteSimples(final String parOptanteSimples) {
    optanteSimples = parOptanteSimples;
  }

  public final String getOrgaoFederal() {
    return orgaoFederal;
  }

  public final void setOrgaoFederal(final String parOrgaoFederal) {
    orgaoFederal = parOrgaoFederal;
  }

  public final String getOrgaoPublico() {
    return orgaoPublico;
  }

  public final void setOrgaoPublico(final String parOrgaoPublico) {
    orgaoPublico = parOrgaoPublico;
  }

  public final String getOrigem() {
    return origem;
  }

  public final void setOrigem(final String parOrigem) {
    origem = parOrigem;
  }

  public final String getOrigemAtualiza() {
    return origemAtualiza;
  }

  public final void setOrigemAtualiza(final String parOrigemAtualiza) {
    origemAtualiza = parOrigemAtualiza;
  }

  public final String getPais() {
    return pais;
  }

  public final void setPais(final String parPais) {
    pais = parPais;
  }

  public final String getPaisFaturamento() {
    return paisFaturamento;
  }

  public final void setPaisFaturamento(final String parPaisFaturamento) {
    paisFaturamento = parPaisFaturamento;
  }

  public final Integer getRegiaoProdutiva() {
    return regiaoProdutiva;
  }

  public final void setRegiaoProdutiva(final Integer parRegiaoProdutiva) {
    regiaoProdutiva = parRegiaoProdutiva;
  }

  public final String getRepresentante() {
    return representante;
  }

  public final void setRepresentante(final String parRepresentante) {
    representante = parRepresentante;
  }

  public final String getResponsavel() {
    return responsavel;
  }

  public final void setResponsavel(final String parResponsavel) {
    responsavel = parResponsavel;
  }

  public final String getResponsavelCancelamento() {
    return responsavelCancelamento;
  }

  public final void setResponsavelCancelamento(final String parResponsavelCancelamento) {
    responsavelCancelamento = parResponsavelCancelamento;
  }

  public final String getResultadoViaInternet() {
    return resultadoViaInternet;
  }

  public final void setResultadoViaInternet(final String parResultadoViaInternet) {
    resultadoViaInternet = parResultadoViaInternet;
  }

  public final String getRmbh() {
    return rmbh;
  }

  public final void setRmbh(final String parRmbh) {
    rmbh = parRmbh;
  }

  public final String getRua() {
    return rua;
  }

  public final void setRua(final String parRua) {
    rua = parRua;
  }

  public final String getScoreCliente() {
    return scoreCliente;
  }

  public final void setScoreCliente(final String parScoreCliente) {
    scoreCliente = parScoreCliente;
  }

  public final String getSituacao() {
    return situacao;
  }

  public final void setSituacao(final String parSituacao) {
    situacao = parSituacao;
  }

  public final String getTabelaPreco() {
    return tabelaPreco;
  }

  public final void setTabelaPreco(final String parTabelaPreco) {
    tabelaPreco = parTabelaPreco;
  }

  public final String getTabelaPromo() {
    return tabelaPromo;
  }

  public final void setTabelaPromo(final String parTabelaPromo) {
    tabelaPromo = parTabelaPromo;
  }

  public final String getTabelaVeterinaria() {
    return tabelaVeterinaria;
  }

  public final void setTabelaVeterinaria(final String parTabelaVeterinaria) {
    tabelaVeterinaria = parTabelaVeterinaria;
  }

  public final String getTelefone() {
    return telefone;
  }

  public final void setTelefone(final String parTelefone) {
    telefone = parTelefone;
  }

  public final String getTipoCliente() {
    return tipoCliente;
  }

  public final void setTipoCliente(final String parTipoCliente) {
    tipoCliente = parTipoCliente;
  }

  public final Integer getTipoRua() {
    return tipoRua;
  }

  public final void setTipoRua(final Integer parTipoRua) {
    tipoRua = parTipoRua;
  }

  public final String getUf() {
    return uf;
  }

  public final void setUf(final String parUf) {
    uf = parUf;
  }

  public final String getUfFaturamento() {
    return ufFaturamento;
  }

  public final void setUfFaturamento(final String parUfFaturamento) {
    ufFaturamento = parUfFaturamento;
  }

  public final String getUltimaOperacao() {
    return ultimaOperacao;
  }

  public final void setUltimaOperacao(final String parUltimaOperacao) {
    ultimaOperacao = parUltimaOperacao;
  }

  public final String getUsoVeterinaria() {
    return usoVeterinaria;
  }

  public final void setUsoVeterinaria(final String parUsoVeterinaria) {
    usoVeterinaria = parUsoVeterinaria;
  }

  public final String getUsuarioAtualiza() {
    return usuarioAtualiza;
  }

  public final void setUsuarioAtualiza(final String parUsuarioAtualiza) {
    usuarioAtualiza = parUsuarioAtualiza;
  }

  public final String getClienteExclusivoLicitacao() {
    return clienteExclusivoLicitacao;
  }

  public final void setClienteExclusivoLicitacao(final String parClienteExclusivoLicitacao) {
    clienteExclusivoLicitacao = parClienteExclusivoLicitacao;
  }

  public final String getPreCadastroDna() {
    return preCadastroDna;
  }

  public final void setPreCadastroDna(final String parPreCadastroDna) {
    preCadastroDna = parPreCadastroDna;
  }

  public final String getUsaApplet() {
    return usaApplet;
  }

  public final void setUsaApplet(final String parUsaApplet) {
    usaApplet = parUsaApplet;
  }

}
