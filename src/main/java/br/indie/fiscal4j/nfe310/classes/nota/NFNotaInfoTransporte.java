package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.nfe310.classes.NFModalidadeFrete;
import br.indie.fiscal4j.validadores.ListValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class NFNotaInfoTransporte extends DFBase {
    private static final long serialVersionUID = 1172316192774549031L;

    @Element(name = "modFrete", required = true)
    private NFModalidadeFrete modalidadeFrete;

    @Element(name = "transporta", required = false)
    private NFNotaInfoTransportador transportador;

    @Element(name = "retTransp", required = false)
    private NFNotaInfoRetencaoICMSTransporte icmsTransporte;

    @Element(name = "veicTransp", required = false)
    private NFNotaInfoVeiculo veiculo;

    @ElementList(entry = "reboque", inline = true, required = false)
    private List<NFNotaInfoReboque> reboques;

    @Element(name = "vagao", required = false)
    private String vagao;

    @Element(name = "balsa", required = false)
    private String balsa;

    @ElementList(entry = "vol", inline = true, required = false)
    private List<NFNotaInfoVolume> volumes;

    public NFModalidadeFrete getModalidadeFrete() {
        return this.modalidadeFrete;
    }

    public void setModalidadeFrete(final NFModalidadeFrete modalidadeFrete) {
        this.modalidadeFrete = modalidadeFrete;
    }

    public NFNotaInfoTransportador getTransportador() {
        return this.transportador;
    }

    public void setTransportador(final NFNotaInfoTransportador transportador) {
        this.transportador = transportador;
    }

    public NFNotaInfoRetencaoICMSTransporte getIcmsTransporte() {
        return this.icmsTransporte;
    }

    public void setIcmsTransporte(final NFNotaInfoRetencaoICMSTransporte icmsTransporte) {
        this.icmsTransporte = icmsTransporte;
    }

    public NFNotaInfoVeiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(final NFNotaInfoVeiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<NFNotaInfoReboque> getReboques() {
        return this.reboques;
    }

    public void setReboques(final List<NFNotaInfoReboque> reboques) {
        ListValidador.tamanho5(reboques, "Reboques");
        this.reboques = reboques;
    }

    public String getVagao() {
        return this.vagao;
    }

    public void setVagao(final String vagao) {
        StringValidador.tamanho20(vagao, "Vagao");
        this.vagao = vagao;
    }

    public String getBalsa() {
        return this.balsa;
    }

    public void setBalsa(final String balsa) {
        StringValidador.tamanho20(balsa, "Balsa");
        this.balsa = balsa;
    }

    public List<NFNotaInfoVolume> getVolumes() {
        return this.volumes;
    }

    public void setVolumes(final List<NFNotaInfoVolume> volumes) {
        ListValidador.tamanho5000(volumes, "Volumes");
        this.volumes = volumes;
    }
}