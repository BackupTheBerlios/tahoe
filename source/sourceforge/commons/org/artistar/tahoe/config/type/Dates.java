/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Dates.java,v 1.1 2003/11/11 08:19:13 fourfive Exp $
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
 * Class Dates.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:13 $
 */
public class Dates implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _AT040AT
     */
    private org.artistar.tahoe.config.type.AT040AT _AT040AT;

    /**
     * Field _AT041AT
     */
    private org.artistar.tahoe.config.type.AT041AT _AT041AT;

    /**
     * Field _AT042AT
     */
    private org.artistar.tahoe.config.type.AT042AT _AT042AT;

    /**
     * Field _AT043AT
     */
    private org.artistar.tahoe.config.type.AT043AT _AT043AT;

    /**
     * Field _AT044AT
     */
    private org.artistar.tahoe.config.type.AT044AT _AT044AT;

    /**
     * Field _AT045AT
     */
    private org.artistar.tahoe.config.type.AT045AT _AT045AT;

    /**
     * Field _AT046AT
     */
    private org.artistar.tahoe.config.type.AT046AT _AT046AT;

    /**
     * Field _AT047AT
     */
    private org.artistar.tahoe.config.type.AT047AT _AT047AT;

    /**
     * Field _AT048AT
     */
    private org.artistar.tahoe.config.type.AT048AT _AT048AT;

    /**
     * Field _AT049AT
     */
    private org.artistar.tahoe.config.type.AT049AT _AT049AT;


      //----------------/
     //- Constructors -/
    //----------------/

    public Dates() {
        super();
    } //-- org.artistar.tahoe.config.type.Dates()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'AT040AT'.
     * 
     * @return the value of field 'AT040AT'.
     */
    public org.artistar.tahoe.config.type.AT040AT getAT040AT()
    {
        return this._AT040AT;
    } //-- org.artistar.tahoe.config.type.AT040AT getAT040AT() 

    /**
     * Returns the value of field 'AT041AT'.
     * 
     * @return the value of field 'AT041AT'.
     */
    public org.artistar.tahoe.config.type.AT041AT getAT041AT()
    {
        return this._AT041AT;
    } //-- org.artistar.tahoe.config.type.AT041AT getAT041AT() 

    /**
     * Returns the value of field 'AT042AT'.
     * 
     * @return the value of field 'AT042AT'.
     */
    public org.artistar.tahoe.config.type.AT042AT getAT042AT()
    {
        return this._AT042AT;
    } //-- org.artistar.tahoe.config.type.AT042AT getAT042AT() 

    /**
     * Returns the value of field 'AT043AT'.
     * 
     * @return the value of field 'AT043AT'.
     */
    public org.artistar.tahoe.config.type.AT043AT getAT043AT()
    {
        return this._AT043AT;
    } //-- org.artistar.tahoe.config.type.AT043AT getAT043AT() 

    /**
     * Returns the value of field 'AT044AT'.
     * 
     * @return the value of field 'AT044AT'.
     */
    public org.artistar.tahoe.config.type.AT044AT getAT044AT()
    {
        return this._AT044AT;
    } //-- org.artistar.tahoe.config.type.AT044AT getAT044AT() 

    /**
     * Returns the value of field 'AT045AT'.
     * 
     * @return the value of field 'AT045AT'.
     */
    public org.artistar.tahoe.config.type.AT045AT getAT045AT()
    {
        return this._AT045AT;
    } //-- org.artistar.tahoe.config.type.AT045AT getAT045AT() 

    /**
     * Returns the value of field 'AT046AT'.
     * 
     * @return the value of field 'AT046AT'.
     */
    public org.artistar.tahoe.config.type.AT046AT getAT046AT()
    {
        return this._AT046AT;
    } //-- org.artistar.tahoe.config.type.AT046AT getAT046AT() 

    /**
     * Returns the value of field 'AT047AT'.
     * 
     * @return the value of field 'AT047AT'.
     */
    public org.artistar.tahoe.config.type.AT047AT getAT047AT()
    {
        return this._AT047AT;
    } //-- org.artistar.tahoe.config.type.AT047AT getAT047AT() 

    /**
     * Returns the value of field 'AT048AT'.
     * 
     * @return the value of field 'AT048AT'.
     */
    public org.artistar.tahoe.config.type.AT048AT getAT048AT()
    {
        return this._AT048AT;
    } //-- org.artistar.tahoe.config.type.AT048AT getAT048AT() 

    /**
     * Returns the value of field 'AT049AT'.
     * 
     * @return the value of field 'AT049AT'.
     */
    public org.artistar.tahoe.config.type.AT049AT getAT049AT()
    {
        return this._AT049AT;
    } //-- org.artistar.tahoe.config.type.AT049AT getAT049AT() 

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
     * Sets the value of field 'AT040AT'.
     * 
     * @param AT040AT the value of field 'AT040AT'.
     */
    public void setAT040AT(org.artistar.tahoe.config.type.AT040AT AT040AT)
    {
        this._AT040AT = AT040AT;
    } //-- void setAT040AT(org.artistar.tahoe.config.type.AT040AT) 

    /**
     * Sets the value of field 'AT041AT'.
     * 
     * @param AT041AT the value of field 'AT041AT'.
     */
    public void setAT041AT(org.artistar.tahoe.config.type.AT041AT AT041AT)
    {
        this._AT041AT = AT041AT;
    } //-- void setAT041AT(org.artistar.tahoe.config.type.AT041AT) 

    /**
     * Sets the value of field 'AT042AT'.
     * 
     * @param AT042AT the value of field 'AT042AT'.
     */
    public void setAT042AT(org.artistar.tahoe.config.type.AT042AT AT042AT)
    {
        this._AT042AT = AT042AT;
    } //-- void setAT042AT(org.artistar.tahoe.config.type.AT042AT) 

    /**
     * Sets the value of field 'AT043AT'.
     * 
     * @param AT043AT the value of field 'AT043AT'.
     */
    public void setAT043AT(org.artistar.tahoe.config.type.AT043AT AT043AT)
    {
        this._AT043AT = AT043AT;
    } //-- void setAT043AT(org.artistar.tahoe.config.type.AT043AT) 

    /**
     * Sets the value of field 'AT044AT'.
     * 
     * @param AT044AT the value of field 'AT044AT'.
     */
    public void setAT044AT(org.artistar.tahoe.config.type.AT044AT AT044AT)
    {
        this._AT044AT = AT044AT;
    } //-- void setAT044AT(org.artistar.tahoe.config.type.AT044AT) 

    /**
     * Sets the value of field 'AT045AT'.
     * 
     * @param AT045AT the value of field 'AT045AT'.
     */
    public void setAT045AT(org.artistar.tahoe.config.type.AT045AT AT045AT)
    {
        this._AT045AT = AT045AT;
    } //-- void setAT045AT(org.artistar.tahoe.config.type.AT045AT) 

    /**
     * Sets the value of field 'AT046AT'.
     * 
     * @param AT046AT the value of field 'AT046AT'.
     */
    public void setAT046AT(org.artistar.tahoe.config.type.AT046AT AT046AT)
    {
        this._AT046AT = AT046AT;
    } //-- void setAT046AT(org.artistar.tahoe.config.type.AT046AT) 

    /**
     * Sets the value of field 'AT047AT'.
     * 
     * @param AT047AT the value of field 'AT047AT'.
     */
    public void setAT047AT(org.artistar.tahoe.config.type.AT047AT AT047AT)
    {
        this._AT047AT = AT047AT;
    } //-- void setAT047AT(org.artistar.tahoe.config.type.AT047AT) 

    /**
     * Sets the value of field 'AT048AT'.
     * 
     * @param AT048AT the value of field 'AT048AT'.
     */
    public void setAT048AT(org.artistar.tahoe.config.type.AT048AT AT048AT)
    {
        this._AT048AT = AT048AT;
    } //-- void setAT048AT(org.artistar.tahoe.config.type.AT048AT) 

    /**
     * Sets the value of field 'AT049AT'.
     * 
     * @param AT049AT the value of field 'AT049AT'.
     */
    public void setAT049AT(org.artistar.tahoe.config.type.AT049AT AT049AT)
    {
        this._AT049AT = AT049AT;
    } //-- void setAT049AT(org.artistar.tahoe.config.type.AT049AT) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.artistar.tahoe.config.type.Dates unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.artistar.tahoe.config.type.Dates) Unmarshaller.unmarshal(org.artistar.tahoe.config.type.Dates.class, reader);
    } //-- org.artistar.tahoe.config.type.Dates unmarshal(java.io.Reader) 

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
