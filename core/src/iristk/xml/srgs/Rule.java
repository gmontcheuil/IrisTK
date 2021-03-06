//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.16 at 08:54:18 AM CET 
//


package iristk.xml.srgs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for rule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://www.w3.org/2001/06/grammar}rule-expansion"/>
 *         &lt;element name="example" type="{http://www.w3.org/2001/06/grammar}example"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/2001/06/grammar}Rule.attribs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rule", propOrder = {
    "content"
})
public class Rule {

    @XmlElementRefs({
        @XmlElementRef(name = "one-of", namespace = "http://www.w3.org/2001/06/grammar", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "token", namespace = "http://www.w3.org/2001/06/grammar", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "example", namespace = "http://www.w3.org/2001/06/grammar", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tag", namespace = "http://www.w3.org/2001/06/grammar", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ruleref", namespace = "http://www.w3.org/2001/06/grammar", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "item", namespace = "http://www.w3.org/2001/06/grammar", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "scope")
    protected ScopeDatatype scope;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OneOf }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link Token }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Ruleref }{@code >}
     * {@link JAXBElement }{@code <}{@link Item }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeDatatype }
     *     
     */
    public ScopeDatatype getScope() {
        if (scope == null) {
            return ScopeDatatype.PRIVATE;
        } else {
            return scope;
        }
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeDatatype }
     *     
     */
    public void setScope(ScopeDatatype value) {
        this.scope = value;
    }

}
