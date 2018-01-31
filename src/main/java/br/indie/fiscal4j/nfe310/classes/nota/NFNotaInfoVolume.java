package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.ListValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class NFNotaInfoVolume extends DFBase {
    private static final long serialVersionUID = -7649649556872297786L;

    @Element(name = "qVol", required = false)
    private BigInteger quantidadeVolumesTransportados;

    @Element(name = "esp", required = false)
    private String especieVolumesTransportados;

    @Element(name = "marca", required = false)
    private String marca;

    @Element(name = "nVol", required = false)
    private String numeracaoVolumesTransportados;

    @Element(name = "pesoL", required = false)
    private String pesoLiquido;

    @Element(name = "pesoB", required = false)
    private String pesoBruto;

    @ElementList(entry = "lacres", inline = true, required = false)
    private List<NFNotaInfoLacre> lacres;

    public BigInteger getQuantidadeVolumesTransportados() {
        return this.quantidadeVolumesTransportados;
    }

    public void setQuantidadeVolumesTransportados(final BigInteger quantidadeVolumesTransportados) {
        this.quantidadeVolumesTransportados = quantidadeVolumesTransportados;
    }

    public String getEspecieVolumesTransportados() {
        return this.especieVolumesTransportados;
    }

    public void setEspecieVolumesTransportados(final String especieVolumesTransportados) {
        StringValidador.tamanho60(especieVolumesTransportados, "Especie Volumes Transportados");
        this.especieVolumesTransportados = especieVolumesTransportados;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(final String marca) {
        StringValidador.tamanho60(marca, "Marca Volume");
        this.marca = marca;
    }

    public String getNumeracaoVolumesTransportados() {
        return this.numeracaoVolumesTransportados;
    }

    public void setNumeracaoVolumesTransportados(final String numeracaoVolumesTransportados) {
        StringValidador.tamanho60(numeracaoVolumesTransportados, "Numeracao Volumes Transportados");
        this.numeracaoVolumesTransportados = numeracaoVolumesTransportados;
    }

    public String getPesoLiquido() {
        return this.pesoLiquido;
    }

    public void setPesoLiquido(final BigDecimal pesoLiquido) {
        this.pesoLiquido = BigDecimalParser.tamanho15Com3CasasDecimais(pesoLiquido, "Peso Liquido Volume");
    }

    public String getPesoBruto() {
        return this.pesoBruto;
    }

    public void setPesoBruto(final BigDecimal pesoBruto) {
        this.pesoBruto = BigDecimalParser.tamanho15Com3CasasDecimais(pesoBruto, "Peso Bruto Volume");
    }

    public List<NFNotaInfoLacre> getLacres() {
        return this.lacres;
    }

    public void setLacres(final List<NFNotaInfoLacre> lacres) {
        ListValidador.tamanho5000(lacres, "Lacres");
        this.lacres = lacres;
    }
}