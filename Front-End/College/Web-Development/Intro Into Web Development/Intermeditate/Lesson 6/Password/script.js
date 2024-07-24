function isStrongPassword(thePassword) {
    if (thePassword.length < 8) { return false;}
    //if password contains password
    else if (thePassword.indexOf("password") ==0)
    { return false;
    }
    // If password contains upercase letters
    else if (thePassword.charAt >=65 && thePassword.charAt <=90)
    { return false;
    }
    else {
        return true;
    }
}
