package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemImpostoImportacao extends DFBase {
    private static final long serialVersionUID = 4211590418053438276L;

    @Element(name = "vBC", required = true)
    private String valorBaseCalculo;

    @Element(name = "vDespAdu", required = true)
    private String valorDespesaAduaneira;

    @Element(name = "vII", required = true)
    private String valorImpostoImportacao;

    @Element(name = "vIOF", required = true)
    private String valorIOF;

    public NFNotaInfoItemImpostoImportacao() {
        this.valorBaseCalculo = null;
        this.valorDespesaAduaneira = null;
        this.valorImpostoImportacao = null;
        this.valorIOF = null;
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = BigDecimalParser.tamanho15Com2CasasDecimais(valorBaseCalculo, "Valor BC Importacao Item");
    }

    public String getValorDespesaAduaneira() {
        return this.valorDespesaAduaneira;
    }

    public void setValorDespesaAduaneira(final BigDecimal valorDespesaAduaneira) {
        this.valorDespesaAduaneira = BigDecimalParser.tamanho15Com2CasasDecimais(valorDespesaAduaneira, "Valor Despesa Aduaneira Importacao Item");
    }

    public String getValorImpostoImportacao() {
        return this.valorImpostoImportacao;
    }

    public void setValorImpostoImportacao(final BigDecimal valorImpostoImportacao) {
        this.valorImpostoImportacao = BigDecimalParser.tamanho15Com2CasasDecimais(valorImpostoImportacao, "Valor Imposto Importacao Item");
    }

    public String getValorIOF() {
        return this.valorIOF;
    }

    public void setValorIOF(final BigDecimal valorIOF) {
        this.valorIOF = BigDecimalParser.tamanho15Com2CasasDecimais(valorIOF, "Valor IOF Importacao Item");
    }
}