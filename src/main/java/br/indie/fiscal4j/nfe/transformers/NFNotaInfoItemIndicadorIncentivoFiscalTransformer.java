package br.indie.fiscal4j.nfe.transformers;

import br.indie.fiscal4j.nfe.classes.nota.NFNotaInfoItemIndicadorIncentivoFiscal;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoItemIndicadorIncentivoFiscalTransformer implements Transform<NFNotaInfoItemIndicadorIncentivoFiscal> {

    @Override
    public NFNotaInfoItemIndicadorIncentivoFiscal read(final String codigo) throws Exception {
        return NFNotaInfoItemIndicadorIncentivoFiscal.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemIndicadorIncentivoFiscal incentivoFiscal) throws Exception {
        return incentivoFiscal.getCodigo();
    }
}