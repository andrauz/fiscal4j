package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.NFProcessoEmissor;
import org.simpleframework.xml.transform.Transform;

public class NFProgramaEmissorTransformer implements Transform<NFProcessoEmissor> {

    @Override
    public NFProcessoEmissor read(final String codigo) {
        return NFProcessoEmissor.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFProcessoEmissor tipo) {
        return tipo.getCodigo();
    }
}