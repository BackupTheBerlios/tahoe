/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Evoobject.java,v 1.1 2003/11/11 08:19:42 fourfive Exp $
 */

package org.artistar.tahoe.config.object;

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
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:42 $
 */
public class Evoobject implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ckey
     */
    private org.artistar.tahoe.config.object.Ckey _ckey;

    /**
     * Field _pkey
     */
    private org.artistar.tahoe.config.object.Pkey _pkey;

    /**
     * Field _validfrom
     */
    private org.artistar.tahoe.config.object.Validfrom _validfrom;

    /**
     * Field _validto
     */
    private org.artistar.tahoe.config.object.Validto _validto;

    /**
     * Field _lastchange
     */
    private org.artistar.tahoe.config.object.Lastchange _lastchange;

    /**
     * Field _type
     */
    private org.artistar.tahoe.config.object.Type _type;

    /**
     * Field _vorder
     */
    private org.artistar.tahoe.config.object.Vorder _vorder;


      //----------------/
     //- Constructors -/
    //----------------/

    public Evoobject() {
        super();
    } //-- org.artistar.tahoe.config.object.Evoobject()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'ckey'.
     * 
     * @return the value of field 'ckey'.
     */
    public org.artistar.tahoe.config.object.Ckey getCkey()
    {
        return this._ckey;
    } //-- org.artistar.tahoe.config.object.Ckey getCkey() 

    /**
     * Returns the value of field 'lastchange'.
     * 
     * @return the value of field 'lastchange'.
     */
    public org.artistar.tahoe.config.object.Lastchange getLastchange()
    {
        return this._lastchange;
    } //-- org.artistar.tahoe.config.object.Lastchange getLastchange() 

    /**
     * Returns the value of field 'pkey'.
     * 
     * @return the value of field 'pkey'.
     */
    public org.artistar.tahoe.config.object.Pkey getPkey()
    {
        return this._pkey;
    } //-- org.artistar.tahoe.config.object.Pkey getPkey() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'type'.
     */
    public org.artistar.tahoe.config.object.Type getType()
    {
        return this._type;
    } //-- org.artistar.tahoe.config.object.Type getType() 

    /**
     * Returns the value of field 'validfrom'.
     * 
     * @return the value of field 'validfrom'.
     */
    public org.artistar.tahoe.config.object.Validfrom getValidfrom()
    {
        return this._validfrom;
    } //-- org.artistar.tahoe.config.object.Validfrom getValidfrom() 

    /**
     * Returns the value of field 'validto'.
     * 
     * @return the value of field 'validto'.
     */
    public org.artistar.tahoe.config.object.Validto getValidto()
    {
        return this._validto;
    } //-- org.artistar.tahoe.config.object.Validto getValidto() 

    /**
     * Returns the value of field 'vorder'.
     * 
     * @return the value of field 'vorder'.
     */
    public org.artistar.tahoe.config.object.Vorder getVorder()
    {
        return this._vorder;
    } //-- org.artistar.tahoe.config.object.Vorder getVorder() 

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
     * Sets the value of field 'ckey'.
     * 
     * @param ckey the value of field 'ckey'.
     */
    public void setCkey(org.artistar.tahoe.config.object.Ckey ckey)
    {
        this._ckey = ckey;
    } //-- void setCkey(org.artistar.tahoe.config.object.Ckey) 

    /**
     * Sets the value of field 'lastchange'.
     * 
     * @param lastchange the value of field 'lastchange'.
     */
    public void setLastchange(org.artistar.tahoe.config.object.Lastchange lastchange)
    {
        this._lastchange = lastchange;
    } //-- void setLastchange(org.artistar.tahoe.config.object.Lastchange) 

    /**
     * Sets the value of field 'pkey'.
     * 
     * @param pkey the value of field 'pkey'.
     */
    public void setPkey(org.artistar.tahoe.config.object.Pkey pkey)
    {
        this._pkey = pkey;
    } //-- void setPkey(org.artistar.tahoe.config.object.Pkey) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(org.artistar.tahoe.config.object.Type type)
    {
        this._type = type;
    } //-- void setType(org.artistar.tahoe.config.object.Type) 

    /**
     * Sets the value of field 'validfrom'.
     * 
     * @param validfrom the value of field 'validfrom'.
     */
    public void setValidfrom(org.artistar.tahoe.config.object.Validfrom validfrom)
    {
        this._validfrom = validfrom;
    } //-- void setValidfrom(org.artistar.tahoe.config.object.Validfrom) 

    /**
     * Sets the value of field 'validto'.
     * 
     * @param validto the value of field 'validto'.
     */
    public void setValidto(org.artistar.tahoe.config.object.Validto validto)
    {
        this._validto = validto;
    } //-- void setValidto(org.artistar.tahoe.config.object.Validto) 

    /**
     * Sets the value of field 'vorder'.
     * 
     * @param vorder the value of field 'vorder'.
     */
    public void setVorder(org.artistar.tahoe.config.object.Vorder vorder)
    {
        this._vorder = vorder;
    } //-- void setVorder(org.artistar.tahoe.config.object.Vorder) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.artistar.tahoe.config.object.Evoobject unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.artistar.tahoe.config.object.Evoobject) Unmarshaller.unmarshal(org.artistar.tahoe.config.object.Evoobject.class, reader);
    } //-- org.artistar.tahoe.config.object.Evoobject unmarshal(java.io.Reader) 

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
