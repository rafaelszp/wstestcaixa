
package br.gov.caixa.sibar;

import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICOENTRADANEGOCIALTYPE;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SERVICO_ENTRADA_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SERVICO_ENTRADA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://caixa.gov.br/sibar}HEADER"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICO_ENTRADA_TYPE", propOrder = {
    "header"
})
@XmlSeeAlso({
    SERVICOENTRADANEGOCIALTYPE.class
})
public class SERVICOENTRADATYPE {

    @XmlElement(name = "HEADER", namespace = "http://caixa.gov.br/sibar", required = true)
    protected HEADERBARRAMENTOTYPE header;

    /**
     * Gets the value of the header property.
     *
     * @return
     *     possible object is
     *     {@link HEADERBARRAMENTOTYPE }
     *
     */
    public HEADERBARRAMENTOTYPE getHEADER() {
        return header;
    }

    /**
     * Sets the value of the header property.
     *
     * @param value
     *     allowed object is
     *     {@link HEADERBARRAMENTOTYPE }
     *
     */
    public void setHEADER(HEADERBARRAMENTOTYPE value) {
        this.header = value;
    }

}
