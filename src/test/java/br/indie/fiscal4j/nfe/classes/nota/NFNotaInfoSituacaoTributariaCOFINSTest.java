package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaCOFINS;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoSituacaoTributariaCOFINSTest {

    @Test
    public void deveRetornarSituacaotributariaCOFINSAoPassarCodigoValido() {
        Assert.assertNotNull(NFNotaInfoSituacaoTributariaCOFINS.valueOfCodigo("01"));
    }

    @Test
    public void deveRetornarNuloCasoPasseValorInvalido() {
        Assert.assertNull(NFNotaInfoSituacaoTributariaCOFINS.valueOfCodigo("00"));
    }
}