package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFNotaInfoEspecieVeiculo;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoEspecieVeiculoTransformer implements Transform<NFNotaInfoEspecieVeiculo> {

    @Override
    public NFNotaInfoEspecieVeiculo read(final String codigoEspecieVeiculo) throws Exception {
        return NFNotaInfoEspecieVeiculo.valueOfCodigo(codigoEspecieVeiculo);
    }

    @Override
    public String write(final NFNotaInfoEspecieVeiculo especieVeiculo) throws Exception {
        return especieVeiculo.getCodigo();
    }
}