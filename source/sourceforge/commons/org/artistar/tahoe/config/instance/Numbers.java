/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Numbers.java,v 1.1 2003/11/11 08:20:05 fourfive Exp $
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
 * Class Numbers.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:20:05 $
 */
public class Numbers implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _AT010AT
     */
    private org.artistar.tahoe.config.instance.AT010AT _AT010AT;

    /**
     * Field _AT011AT
     */
    private org.artistar.tahoe.config.instance.AT011AT _AT011AT;

    /**
     * Field _AT012AT
     */
    private org.artistar.tahoe.config.instance.AT012AT _AT012AT;

    /**
     * Field _AT013AT
     */
    private org.artistar.tahoe.config.instance.AT013AT _AT013AT;

    /**
     * Field _AT014AT
     */
    private org.artistar.tahoe.config.instance.AT014AT _AT014AT;

    /**
     * Field _AT015AT
     */
    private org.artistar.tahoe.config.instance.AT015AT _AT015AT;

    /**
     * Field _AT016AT
     */
    private org.artistar.tahoe.config.instance.AT016AT _AT016AT;

    /**
     * Field _AT017AT
     */
    private org.artistar.tahoe.config.instance.AT017AT _AT017AT;

    /**
     * Field _AT018AT
     */
    private org.artistar.tahoe.config.instance.AT018AT _AT018AT;

    /**
     * Field _AT019AT
     */
    private org.artistar.tahoe.config.instance.AT019AT _AT019AT;


      //----------------/
     //- Constructors -/
    //----------------/

    public Numbers() {
        super();
    } //-- org.artistar.tahoe.config.instance.Numbers()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'AT010AT'.
     * 
     * @return the value of field 'AT010AT'.
     */
    public org.artistar.tahoe.config.instance.AT010AT getAT010AT()
    {
        return this._AT010AT;
    } //-- org.artistar.tahoe.config.instance.AT010AT getAT010AT() 

    /**
     * Returns the value of field 'AT011AT'.
     * 
     * @return the value of field 'AT011AT'.
     */
    public org.artistar.tahoe.config.instance.AT011AT getAT011AT()
    {
        return this._AT011AT;
    } //-- org.artistar.tahoe.config.instance.AT011AT getAT011AT() 

    /**
     * Returns the value of field 'AT012AT'.
     * 
     * @return the value of field 'AT012AT'.
     */
    public org.artistar.tahoe.config.instance.AT012AT getAT012AT()
    {
        return this._AT012AT;
    } //-- org.artistar.tahoe.config.instance.AT012AT getAT012AT() 

    /**
     * Returns the value of field 'AT013AT'.
     * 
     * @return the value of field 'AT013AT'.
     */
    public org.artistar.tahoe.config.instance.AT013AT getAT013AT()
    {
        return this._AT013AT;
    } //-- org.artistar.tahoe.config.instance.AT013AT getAT013AT() 

    /**
     * Returns the value of field 'AT014AT'.
     * 
     * @return the value of field 'AT014AT'.
     */
    public org.artistar.tahoe.config.instance.AT014AT getAT014AT()
    {
        return this._AT014AT;
    } //-- org.artistar.tahoe.config.instance.AT014AT getAT014AT() 

    /**
     * Returns the value of field 'AT015AT'.
     * 
     * @return the value of field 'AT015AT'.
     */
    public org.artistar.tahoe.config.instance.AT015AT getAT015AT()
    {
        return this._AT015AT;
    } //-- org.artistar.tahoe.config.instance.AT015AT getAT015AT() 

    /**
     * Returns the value of field 'AT016AT'.
     * 
     * @return the value of field 'AT016AT'.
     */
    public org.artistar.tahoe.config.instance.AT016AT getAT016AT()
    {
        return this._AT016AT;
    } //-- org.artistar.tahoe.config.instance.AT016AT getAT016AT() 

    /**
     * Returns the value of field 'AT017AT'.
     * 
     * @return the value of field 'AT017AT'.
     */
    public org.artistar.tahoe.config.instance.AT017AT getAT017AT()
    {
        return this._AT017AT;
    } //-- org.artistar.tahoe.config.instance.AT017AT getAT017AT() 

    /**
     * Returns the value of field 'AT018AT'.
     * 
     * @return the value of field 'AT018AT'.
     */
    public org.artistar.tahoe.config.instance.AT018AT getAT018AT()
    {
        return this._AT018AT;
    } //-- org.artistar.tahoe.config.instance.AT018AT getAT018AT() 

    /**
     * Returns the value of field 'AT019AT'.
     * 
     * @return the value of field 'AT019AT'.
     */
    public org.artistar.tahoe.config.instance.AT019AT getAT019AT()
    {
        return this._AT019AT;
    } //-- org.artistar.tahoe.config.instance.AT019AT getAT019AT() 

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
     * Sets the value of field 'AT010AT'.
     * 
     * @param AT010AT the value of field 'AT010AT'.
     */
    public void setAT010AT(org.artistar.tahoe.config.instance.AT010AT AT010AT)
    {
        this._AT010AT = AT010AT;
    } //-- void setAT010AT(org.artistar.tahoe.config.instance.AT010AT) 

    /**
     * Sets the value of field 'AT011AT'.
     * 
     * @param AT011AT the value of field 'AT011AT'.
     */
    public void setAT011AT(org.artistar.tahoe.config.instance.AT011AT AT011AT)
    {
        this._AT011AT = AT011AT;
    } //-- void setAT011AT(org.artistar.tahoe.config.instance.AT011AT) 

    /**
     * Sets the value of field 'AT012AT'.
     * 
     * @param AT012AT the value of field 'AT012AT'.
     */
    public void setAT012AT(org.artistar.tahoe.config.instance.AT012AT AT012AT)
    {
        this._AT012AT = AT012AT;
    } //-- void setAT012AT(org.artistar.tahoe.config.instance.AT012AT) 

    /**
     * Sets the value of field 'AT013AT'.
     * 
     * @param AT013AT the value of field 'AT013AT'.
     */
    public void setAT013AT(org.artistar.tahoe.config.instance.AT013AT AT013AT)
    {
        this._AT013AT = AT013AT;
    } //-- void setAT013AT(org.artistar.tahoe.config.instance.AT013AT) 

    /**
     * Sets the value of field 'AT014AT'.
     * 
     * @param AT014AT the value of field 'AT014AT'.
     */
    public void setAT014AT(org.artistar.tahoe.config.instance.AT014AT AT014AT)
    {
        this._AT014AT = AT014AT;
    } //-- void setAT014AT(org.artistar.tahoe.config.instance.AT014AT) 

    /**
     * Sets the value of field 'AT015AT'.
     * 
     * @param AT015AT the value of field 'AT015AT'.
     */
    public void setAT015AT(org.artistar.tahoe.config.instance.AT015AT AT015AT)
    {
        this._AT015AT = AT015AT;
    } //-- void setAT015AT(org.artistar.tahoe.config.instance.AT015AT) 

    /**
     * Sets the value of field 'AT016AT'.
     * 
     * @param AT016AT the value of field 'AT016AT'.
     */
    public void setAT016AT(org.artistar.tahoe.config.instance.AT016AT AT016AT)
    {
        this._AT016AT = AT016AT;
    } //-- void setAT016AT(org.artistar.tahoe.config.instance.AT016AT) 

    /**
     * Sets the value of field 'AT017AT'.
     * 
     * @param AT017AT the value of field 'AT017AT'.
     */
    public void setAT017AT(org.artistar.tahoe.config.instance.AT017AT AT017AT)
    {
        this._AT017AT = AT017AT;
    } //-- void setAT017AT(org.artistar.tahoe.config.instance.AT017AT) 

    /**
     * Sets the value of field 'AT018AT'.
     * 
     * @param AT018AT the value of field 'AT018AT'.
     */
    public void setAT018AT(org.artistar.tahoe.config.instance.AT018AT AT018AT)
    {
        this._AT018AT = AT018AT;
    } //-- void setAT018AT(org.artistar.tahoe.config.instance.AT018AT) 

    /**
     * Sets the value of field 'AT019AT'.
     * 
     * @param AT019AT the value of field 'AT019AT'.
     */
    public void setAT019AT(org.artistar.tahoe.config.instance.AT019AT AT019AT)
    {
        this._AT019AT = AT019AT;
    } //-- void setAT019AT(org.artistar.tahoe.config.instance.AT019AT) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.artistar.tahoe.config.instance.Numbers unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.artistar.tahoe.config.instance.Numbers) Unmarshaller.unmarshal(org.artistar.tahoe.config.instance.Numbers.class, reader);
    } //-- org.artistar.tahoe.config.instance.Numbers unmarshal(java.io.Reader) 

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
