/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Evoinstance.java,v 1.1 2003/11/11 08:19:57 fourfive Exp $
 */

package org.artistar.tahoe.config.instance;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Comment describing your root element
 * 
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:57 $
 */
public class Evoinstance implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ckey
     */
    private org.artistar.tahoe.config.instance.Ckey _ckey;

    /**
     * Field _pkey
     */
    private org.artistar.tahoe.config.instance.Pkey _pkey;

    /**
     * Field _validfrom
     */
    private org.artistar.tahoe.config.instance.Validfrom _validfrom;

    /**
     * Field _attributes
     */
    private org.artistar.tahoe.config.instance.Attributes _attributes;


      //----------------/
     //- Constructors -/
    //----------------/

    public Evoinstance() {
        super();
    } //-- org.artistar.tahoe.config.instance.Evoinstance()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'attributes'.
     * 
     * @return the value of field 'attributes'.
     */
    public org.artistar.tahoe.config.instance.Attributes getAttributes()
    {
        return this._attributes;
    } //-- org.artistar.tahoe.config.instance.Attributes getAttributes() 

    /**
     * Returns the value of field 'ckey'.
     * 
     * @return the value of field 'ckey'.
     */
    public org.artistar.tahoe.config.instance.Ckey getCkey()
    {
        return this._ckey;
    } //-- org.artistar.tahoe.config.instance.Ckey getCkey() 

    /**
     * Returns the value of field 'pkey'.
     * 
     * @return the value of field 'pkey'.
     */
    public org.artistar.tahoe.config.instance.Pkey getPkey()
    {
        return this._pkey;
    } //-- org.artistar.tahoe.config.instance.Pkey getPkey() 

    /**
     * Returns the value of field 'validfrom'.
     * 
     * @return the value of field 'validfrom'.
     */
    public org.artistar.tahoe.config.instance.Validfrom getValidfrom()
    {
        return this._validfrom;
    } //-- org.artistar.tahoe.config.instance.Validfrom getValidfrom() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'attributes'.
     * 
     * @param attributes the value of field 'attributes'.
     */
    public void setAttributes(org.artistar.tahoe.config.instance.Attributes attributes)
    {
        this._attributes = attributes;
    } //-- void setAttributes(org.artistar.tahoe.config.instance.Attributes) 

    /**
     * Sets the value of field 'ckey'.
     * 
     * @param ckey the value of field 'ckey'.
     */
    public void setCkey(org.artistar.tahoe.config.instance.Ckey ckey)
    {
        this._ckey = ckey;
    } //-- void setCkey(org.artistar.tahoe.config.instance.Ckey) 

    /**
     * Sets the value of field 'pkey'.
     * 
     * @param pkey the value of field 'pkey'.
     */
    public void setPkey(org.artistar.tahoe.config.instance.Pkey pkey)
    {
        this._pkey = pkey;
    } //-- void setPkey(org.artistar.tahoe.config.instance.Pkey) 

    /**
     * Sets the value of field 'validfrom'.
     * 
     * @param validfrom the value of field 'validfrom'.
     */
    public void setValidfrom(org.artistar.tahoe.config.instance.Validfrom validfrom)
    {
        this._validfrom = validfrom;
    } //-- void setValidfrom(org.artistar.tahoe.config.instance.Validfrom) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.artistar.tahoe.config.instance.Evoinstance unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.artistar.tahoe.config.instance.Evoinstance) Unmarshaller.unmarshal(org.artistar.tahoe.config.instance.Evoinstance.class, reader);
    } //-- org.artistar.tahoe.config.instance.Evoinstance unmarshal(java.io.Reader) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
