/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: EvoobjectsToTypes.java,v 1.1 2003/11/11 08:19:38 fourfive Exp $
 */

package org.artistar.tahoe.config.objecttype;

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
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:38 $
 */
public class EvoobjectsToTypes implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _akey
     */
    private org.artistar.tahoe.config.objecttype.Akey _akey;

    /**
     * Field _pkey
     */
    private org.artistar.tahoe.config.objecttype.Pkey _pkey;

    /**
     * Field _ckey
     */
    private org.artistar.tahoe.config.objecttype.Ckey _ckey;

    /**
     * Field _validfrom
     */
    private org.artistar.tahoe.config.objecttype.Validfrom _validfrom;

    /**
     * Field _validto
     */
    private org.artistar.tahoe.config.objecttype.Validto _validto;

    /**
     * Field _type
     */
    private org.artistar.tahoe.config.objecttype.Type _type;

    /**
     * Field _vlock
     */
    private org.artistar.tahoe.config.objecttype.Vlock _vlock;


      //----------------/
     //- Constructors -/
    //----------------/

    public EvoobjectsToTypes() {
        super();
    } //-- org.artistar.tahoe.config.objecttype.EvoobjectsToTypes()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'akey'.
     * 
     * @return the value of field 'akey'.
     */
    public org.artistar.tahoe.config.objecttype.Akey getAkey()
    {
        return this._akey;
    } //-- org.artistar.tahoe.config.objecttype.Akey getAkey() 

    /**
     * Returns the value of field 'ckey'.
     * 
     * @return the value of field 'ckey'.
     */
    public org.artistar.tahoe.config.objecttype.Ckey getCkey()
    {
        return this._ckey;
    } //-- org.artistar.tahoe.config.objecttype.Ckey getCkey() 

    /**
     * Returns the value of field 'pkey'.
     * 
     * @return the value of field 'pkey'.
     */
    public org.artistar.tahoe.config.objecttype.Pkey getPkey()
    {
        return this._pkey;
    } //-- org.artistar.tahoe.config.objecttype.Pkey getPkey() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'type'.
     */
    public org.artistar.tahoe.config.objecttype.Type getType()
    {
        return this._type;
    } //-- org.artistar.tahoe.config.objecttype.Type getType() 

    /**
     * Returns the value of field 'validfrom'.
     * 
     * @return the value of field 'validfrom'.
     */
    public org.artistar.tahoe.config.objecttype.Validfrom getValidfrom()
    {
        return this._validfrom;
    } //-- org.artistar.tahoe.config.objecttype.Validfrom getValidfrom() 

    /**
     * Returns the value of field 'validto'.
     * 
     * @return the value of field 'validto'.
     */
    public org.artistar.tahoe.config.objecttype.Validto getValidto()
    {
        return this._validto;
    } //-- org.artistar.tahoe.config.objecttype.Validto getValidto() 

    /**
     * Returns the value of field 'vlock'.
     * 
     * @return the value of field 'vlock'.
     */
    public org.artistar.tahoe.config.objecttype.Vlock getVlock()
    {
        return this._vlock;
    } //-- org.artistar.tahoe.config.objecttype.Vlock getVlock() 

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
     * Sets the value of field 'akey'.
     * 
     * @param akey the value of field 'akey'.
     */
    public void setAkey(org.artistar.tahoe.config.objecttype.Akey akey)
    {
        this._akey = akey;
    } //-- void setAkey(org.artistar.tahoe.config.objecttype.Akey) 

    /**
     * Sets the value of field 'ckey'.
     * 
     * @param ckey the value of field 'ckey'.
     */
    public void setCkey(org.artistar.tahoe.config.objecttype.Ckey ckey)
    {
        this._ckey = ckey;
    } //-- void setCkey(org.artistar.tahoe.config.objecttype.Ckey) 

    /**
     * Sets the value of field 'pkey'.
     * 
     * @param pkey the value of field 'pkey'.
     */
    public void setPkey(org.artistar.tahoe.config.objecttype.Pkey pkey)
    {
        this._pkey = pkey;
    } //-- void setPkey(org.artistar.tahoe.config.objecttype.Pkey) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(org.artistar.tahoe.config.objecttype.Type type)
    {
        this._type = type;
    } //-- void setType(org.artistar.tahoe.config.objecttype.Type) 

    /**
     * Sets the value of field 'validfrom'.
     * 
     * @param validfrom the value of field 'validfrom'.
     */
    public void setValidfrom(org.artistar.tahoe.config.objecttype.Validfrom validfrom)
    {
        this._validfrom = validfrom;
    } //-- void setValidfrom(org.artistar.tahoe.config.objecttype.Validfrom) 

    /**
     * Sets the value of field 'validto'.
     * 
     * @param validto the value of field 'validto'.
     */
    public void setValidto(org.artistar.tahoe.config.objecttype.Validto validto)
    {
        this._validto = validto;
    } //-- void setValidto(org.artistar.tahoe.config.objecttype.Validto) 

    /**
     * Sets the value of field 'vlock'.
     * 
     * @param vlock the value of field 'vlock'.
     */
    public void setVlock(org.artistar.tahoe.config.objecttype.Vlock vlock)
    {
        this._vlock = vlock;
    } //-- void setVlock(org.artistar.tahoe.config.objecttype.Vlock) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.artistar.tahoe.config.objecttype.EvoobjectsToTypes unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.artistar.tahoe.config.objecttype.EvoobjectsToTypes) Unmarshaller.unmarshal(org.artistar.tahoe.config.objecttype.EvoobjectsToTypes.class, reader);
    } //-- org.artistar.tahoe.config.objecttype.EvoobjectsToTypes unmarshal(java.io.Reader) 

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
