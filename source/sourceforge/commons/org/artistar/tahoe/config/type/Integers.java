/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Integers.java,v 1.1 2003/11/11 08:19:17 fourfive Exp $
 */

package org.artistar.tahoe.config.type;

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
 * Class Integers.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:17 $
 */
public class Integers implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _AT000AT
     */
    private org.artistar.tahoe.config.type.AT000AT _AT000AT;

    /**
     * Field _AT001AT
     */
    private org.artistar.tahoe.config.type.AT001AT _AT001AT;

    /**
     * Field _AT002AT
     */
    private org.artistar.tahoe.config.type.AT002AT _AT002AT;

    /**
     * Field _AT003AT
     */
    private org.artistar.tahoe.config.type.AT003AT _AT003AT;

    /**
     * Field _AT004AT
     */
    private org.artistar.tahoe.config.type.AT004AT _AT004AT;

    /**
     * Field _AT005AT
     */
    private org.artistar.tahoe.config.type.AT005AT _AT005AT;

    /**
     * Field _AT006AT
     */
    private org.artistar.tahoe.config.type.AT006AT _AT006AT;

    /**
     * Field _AT007AT
     */
    private org.artistar.tahoe.config.type.AT007AT _AT007AT;

    /**
     * Field _AT008AT
     */
    private org.artistar.tahoe.config.type.AT008AT _AT008AT;

    /**
     * Field _AT009AT
     */
    private org.artistar.tahoe.config.type.AT009AT _AT009AT;


      //----------------/
     //- Constructors -/
    //----------------/

    public Integers() {
        super();
    } //-- org.artistar.tahoe.config.type.Integers()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'AT000AT'.
     * 
     * @return the value of field 'AT000AT'.
     */
    public org.artistar.tahoe.config.type.AT000AT getAT000AT()
    {
        return this._AT000AT;
    } //-- org.artistar.tahoe.config.type.AT000AT getAT000AT() 

    /**
     * Returns the value of field 'AT001AT'.
     * 
     * @return the value of field 'AT001AT'.
     */
    public org.artistar.tahoe.config.type.AT001AT getAT001AT()
    {
        return this._AT001AT;
    } //-- org.artistar.tahoe.config.type.AT001AT getAT001AT() 

    /**
     * Returns the value of field 'AT002AT'.
     * 
     * @return the value of field 'AT002AT'.
     */
    public org.artistar.tahoe.config.type.AT002AT getAT002AT()
    {
        return this._AT002AT;
    } //-- org.artistar.tahoe.config.type.AT002AT getAT002AT() 

    /**
     * Returns the value of field 'AT003AT'.
     * 
     * @return the value of field 'AT003AT'.
     */
    public org.artistar.tahoe.config.type.AT003AT getAT003AT()
    {
        return this._AT003AT;
    } //-- org.artistar.tahoe.config.type.AT003AT getAT003AT() 

    /**
     * Returns the value of field 'AT004AT'.
     * 
     * @return the value of field 'AT004AT'.
     */
    public org.artistar.tahoe.config.type.AT004AT getAT004AT()
    {
        return this._AT004AT;
    } //-- org.artistar.tahoe.config.type.AT004AT getAT004AT() 

    /**
     * Returns the value of field 'AT005AT'.
     * 
     * @return the value of field 'AT005AT'.
     */
    public org.artistar.tahoe.config.type.AT005AT getAT005AT()
    {
        return this._AT005AT;
    } //-- org.artistar.tahoe.config.type.AT005AT getAT005AT() 

    /**
     * Returns the value of field 'AT006AT'.
     * 
     * @return the value of field 'AT006AT'.
     */
    public org.artistar.tahoe.config.type.AT006AT getAT006AT()
    {
        return this._AT006AT;
    } //-- org.artistar.tahoe.config.type.AT006AT getAT006AT() 

    /**
     * Returns the value of field 'AT007AT'.
     * 
     * @return the value of field 'AT007AT'.
     */
    public org.artistar.tahoe.config.type.AT007AT getAT007AT()
    {
        return this._AT007AT;
    } //-- org.artistar.tahoe.config.type.AT007AT getAT007AT() 

    /**
     * Returns the value of field 'AT008AT'.
     * 
     * @return the value of field 'AT008AT'.
     */
    public org.artistar.tahoe.config.type.AT008AT getAT008AT()
    {
        return this._AT008AT;
    } //-- org.artistar.tahoe.config.type.AT008AT getAT008AT() 

    /**
     * Returns the value of field 'AT009AT'.
     * 
     * @return the value of field 'AT009AT'.
     */
    public org.artistar.tahoe.config.type.AT009AT getAT009AT()
    {
        return this._AT009AT;
    } //-- org.artistar.tahoe.config.type.AT009AT getAT009AT() 

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
     * Sets the value of field 'AT000AT'.
     * 
     * @param AT000AT the value of field 'AT000AT'.
     */
    public void setAT000AT(org.artistar.tahoe.config.type.AT000AT AT000AT)
    {
        this._AT000AT = AT000AT;
    } //-- void setAT000AT(org.artistar.tahoe.config.type.AT000AT) 

    /**
     * Sets the value of field 'AT001AT'.
     * 
     * @param AT001AT the value of field 'AT001AT'.
     */
    public void setAT001AT(org.artistar.tahoe.config.type.AT001AT AT001AT)
    {
        this._AT001AT = AT001AT;
    } //-- void setAT001AT(org.artistar.tahoe.config.type.AT001AT) 

    /**
     * Sets the value of field 'AT002AT'.
     * 
     * @param AT002AT the value of field 'AT002AT'.
     */
    public void setAT002AT(org.artistar.tahoe.config.type.AT002AT AT002AT)
    {
        this._AT002AT = AT002AT;
    } //-- void setAT002AT(org.artistar.tahoe.config.type.AT002AT) 

    /**
     * Sets the value of field 'AT003AT'.
     * 
     * @param AT003AT the value of field 'AT003AT'.
     */
    public void setAT003AT(org.artistar.tahoe.config.type.AT003AT AT003AT)
    {
        this._AT003AT = AT003AT;
    } //-- void setAT003AT(org.artistar.tahoe.config.type.AT003AT) 

    /**
     * Sets the value of field 'AT004AT'.
     * 
     * @param AT004AT the value of field 'AT004AT'.
     */
    public void setAT004AT(org.artistar.tahoe.config.type.AT004AT AT004AT)
    {
        this._AT004AT = AT004AT;
    } //-- void setAT004AT(org.artistar.tahoe.config.type.AT004AT) 

    /**
     * Sets the value of field 'AT005AT'.
     * 
     * @param AT005AT the value of field 'AT005AT'.
     */
    public void setAT005AT(org.artistar.tahoe.config.type.AT005AT AT005AT)
    {
        this._AT005AT = AT005AT;
    } //-- void setAT005AT(org.artistar.tahoe.config.type.AT005AT) 

    /**
     * Sets the value of field 'AT006AT'.
     * 
     * @param AT006AT the value of field 'AT006AT'.
     */
    public void setAT006AT(org.artistar.tahoe.config.type.AT006AT AT006AT)
    {
        this._AT006AT = AT006AT;
    } //-- void setAT006AT(org.artistar.tahoe.config.type.AT006AT) 

    /**
     * Sets the value of field 'AT007AT'.
     * 
     * @param AT007AT the value of field 'AT007AT'.
     */
    public void setAT007AT(org.artistar.tahoe.config.type.AT007AT AT007AT)
    {
        this._AT007AT = AT007AT;
    } //-- void setAT007AT(org.artistar.tahoe.config.type.AT007AT) 

    /**
     * Sets the value of field 'AT008AT'.
     * 
     * @param AT008AT the value of field 'AT008AT'.
     */
    public void setAT008AT(org.artistar.tahoe.config.type.AT008AT AT008AT)
    {
        this._AT008AT = AT008AT;
    } //-- void setAT008AT(org.artistar.tahoe.config.type.AT008AT) 

    /**
     * Sets the value of field 'AT009AT'.
     * 
     * @param AT009AT the value of field 'AT009AT'.
     */
    public void setAT009AT(org.artistar.tahoe.config.type.AT009AT AT009AT)
    {
        this._AT009AT = AT009AT;
    } //-- void setAT009AT(org.artistar.tahoe.config.type.AT009AT) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.artistar.tahoe.config.type.Integers unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.artistar.tahoe.config.type.Integers) Unmarshaller.unmarshal(org.artistar.tahoe.config.type.Integers.class, reader);
    } //-- org.artistar.tahoe.config.type.Integers unmarshal(java.io.Reader) 

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
