package br.indie.fiscal4j.nfe.classes.evento;

import br.indie.fiscal4j.common.DFAmbiente;
import br.indie.fiscal4j.common.DFUnidadeFederativa;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class NFEnviaEventoRetornoTest {

    @Test
    public void deveObterAmbienteComoFoiSetado() {
        final NFEnviaEventoRetorno eventoRetorno = new NFEnviaEventoRetorno();
        final DFAmbiente ambiente = DFAmbiente.HOMOLOGACAO;
        eventoRetorno.setAmbiente(ambiente);
        Assert.assertEquals(ambiente, eventoRetorno.getAmbiente());
    }

    @Test
    public void deveObterCodigoStatusRepostaComoFoiSetado() {
        final NFEnviaEventoRetorno eventoRetorno = new NFEnviaEventoRetorno();
        final int codigoStatusReposta = 900;
        eventoRetorno.setCodigoStatusReposta(codigoStatusReposta);
        Assert.assertEquals(codigoStatusReposta, eventoRetorno.getCodigoStatusReposta(), 0);
    }

    @Test
    public void deveObterEventoRetornoComoFoiSetado() {
        final NFEnviaEventoRetorno eventoRetorno = new NFEnviaEventoRetorno();
        final ArrayList<NFEventoRetorno> eventosRetorno = new ArrayList<>();
        eventoRetorno.setEventoRetorno(eventosRetorno);
        Assert.assertEquals(eventosRetorno, eventoRetorno.getEventoRetorno());
    }

    @Test
    public void deveObterIdLoteComoFoiSetado() {
        final NFEnviaEventoRetorno eventoRetorno = new NFEnviaEventoRetorno();
        final String idLote = "99";
        eventoRetorno.setIdLote(idLote);
        Assert.assertEquals(idLote, eventoRetorno.getIdLote());
    }

    @Test
    public void deveObterMotivoComoFoiSetado() {
        final NFEnviaEventoRetorno eventoRetorno = new NFEnviaEventoRetorno();
        final String motivo = "Motivo turpe";
        eventoRetorno.setMotivo(motivo);
        Assert.assertEquals(motivo, eventoRetorno.getMotivo());
    }

    @Test
    public void deveObterOrgaoComoFoiSetado() {
        final NFEnviaEventoRetorno eventoRetorno = new NFEnviaEventoRetorno();
        final DFUnidadeFederativa unidadeFederativa = DFUnidadeFederativa.SC;
        eventoRetorno.setOrgao(unidadeFederativa);
        Assert.assertEquals(unidadeFederativa, eventoRetorno.getOrgao());
    }

    @Test
    public void deveObterVersaoComoFoiSetado() {
        final NFEnviaEventoRetorno eventoRetorno = new NFEnviaEventoRetorno();
        final String versao = "4.00";
        eventoRetorno.setVersao(versao);
        Assert.assertEquals(versao, eventoRetorno.getVersao());
    }

    @Test
    public void deveObterVersaoAplicativoComoFoiSetado() {
        final NFEnviaEventoRetorno eventoRetorno = new NFEnviaEventoRetorno();
        final String versaoAplicativo = "v10.0";
        eventoRetorno.setVersaoAplicativo(versaoAplicativo);
        Assert.assertEquals(versaoAplicativo, eventoRetorno.getVersaoAplicativo());
    }
}