/*
    The Phoenix Hospitality Management System
    System Library Package
    Setting Object Definition Code File
    Copyright (c) 2020 By Troy Marker Enterprises
    All Rights Under Copyright Reserved

    The code in this file was created for use with the Phoenix Hospitality Management System (PHMS).
    Use of this code outside the PHMS is strictly prohibited.
 */
package com.phoenixhosman.phoenixlib;

public class ObjectSettings {
    public String mCoName;
    public String mCoAddress;
    public String mCoCity;
    public String mCoState;
    public String mCoZip;
    public String mApiUrl;
    public String mLockPass;
    public String mApiKey;

    /**
     * Gets company name.
     * @return the company name
     */

    public String getCoName () {
        return mCoName;
    }
    /**
     * Sets company name.
     * @param mCoName the company name
     */
    public void setCoName (String mCoName) {
        this.mCoName = mCoName;
    }

    /**
     * Gets company address.
     * @return the company address
     */
    public String getCoAddress () {
        return mCoAddress;
    }

    /**
     * Sets company address.
     * @param mCoAddress the company address
     */
    public void setCoAddress (String mCoAddress) {
        this.mCoAddress = mCoAddress;
    }

    /**
     * Gets company city.
     * @return the company city
     */
    public String getCoCity () {
        return mCoCity;
    }

    /**
     * Sets company city.
     * @param mCoCity the company city
     */
    public void setCoCity (String mCoCity) {
        this.mCoCity = mCoCity;
    }

    /**
     * Gets company state.
     * @return the company state
     */
    public String getCoState () {
        return mCoState;
    }

    /**
     * Sets company state.
     * @param mCoState the company state
     */
    public void setCoState (String mCoState) {
        this.mCoState = mCoState;
    }

    /**
     * Gets company zip.
     * @return the company zip
     */
    public String getCoZip () {
        return mCoZip;
    }

    /**
     * Sets company zip.
     * @param mCoZip the company zip
     */
    public void setCoZip (String mCoZip) {
        this.mCoZip = mCoZip;
    }

    /**
     * Gets api url.
     * @return the api url
     */
    public String getApiUrl () {
        return mApiUrl;
    }

    /**
     * Sets api url.
     * @param mApiUrl the API URL
     */
    public void setApiUrl (String mApiUrl) {
        this.mApiUrl = mApiUrl;
    }

    /**
     * Sets Lock Password
     * @param mLockPass The lock Passeword
     */
    public void setLockPass (String mLockPass) { this.mLockPass = mLockPass; }

    /**
     * Gets the Lock Password
     * @return the lock password
     */
    public String getLockPass () { return mLockPass; }

    /**
     * Gets the Api Key
     * @return the API Key
     */
    public String getApiKey() {
        return mApiKey;
    }

    /**
     * Sets the Api Key
     * @param mApiKey the api key
     */
    public void setApiKey (String mApiKey) {
        this.mApiKey = mApiKey;
    }
}
