package oving2;

import java.util.Arrays;
import java.util.Date;
import java.util.List; 

public class Person {
    
    String name;
    String email;
    Date birthday;
    char gender;
    String fname;
    String lname;

    public void setName(String name) {
        if (name.matches("([A-ÆØÅa-æøå]{2,} +[A-ÆØÅa-æøå]{2,})")) {
            String[] nameLi = name.split(" ");
            fname = nameLi[0];
            lname = nameLi[1];
            this.name = name;
        }
    }

    public void setEmail(String email) {
        List<String> landKode = Arrays.asList(
            "ad", "ae", "af", "ag", "ai", "al", "am", "ao", "aq", "ar",
            "as", "at", "au", "aw", "ax", "az", "ba", "bb", "bd", "be",
            "bf", "bg", "bh", "bi", "bj", "bl", "bm", "bn", "bo", "bq",
            "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd",
            "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co", "cr",
            "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", "dm",
            "do", "dz", "ec", "ee", "eg", "eh", "er", "es", "et", "fi",
            "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf",
            "gg", "gh", "gi", "gl", "gm", "gn", "gp", "gq", "gr", "gs",
            "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu",
            "id", "ie", "il", "im", "in", "io", "iq", "ir", "is", "it",
            "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn",
            "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk",
            "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "me",
            "mf", "mg", "mh", "mk", "ml", "mm", "mn", "mo", "mp", "mq",
            "mr", "ms", "mt", "mu", "mv", "mw", "mx", "my", "mz", "na",
            "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nu",
            "nz", "om", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm",
            "pn", "pr", "ps", "pt", "pw", "py", "qa", "re", "ro", "rs",
            "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si",
            "sj", "sk", "sl", "sm", "sn", "so", "sr", "ss", "st", "sv",
            "sx", "sy", "sz", "tc", "td", "tf", "tg", "th", "tj", "tk",
            "tl", "tm", "tn", "to", "tr", "tt", "tv", "tw", "tz", "ua",
            "ug", "um", "us", "uy", "uz", "va", "vc", "ve", "vg", "vi",
            "vn", "vu", "wf", "ws", "ye", "yt", "za", "zm", "zw"
            );
            if (email.matches(fname.toLowerCase() +"\\."+ lname.toLowerCase() + "(?:@[a-æøå0-9]+\\.[a-æøå]{2})")) {
                String landKodeTest = String.valueOf(email.charAt(email.length() - 2)) + String.valueOf(email.charAt(email.length() - 1));
                if(landKode.contains(landKodeTest)){
                    this.email = email;
                }
                else throw new IllegalStateException("Wrong E-mail format");
            }   
    }

    public void setBirthday(Date birthday) {
        if (birthday.compareTo(new Date()) < 0) {
            this.birthday = birthday;
		}
        throw new IllegalArgumentException("Invallid birthday");		
    }

    public void setGender(char gender) {
        if (gender != 'M' && gender != 'F' && gender != '\0'){
            throw new IllegalArgumentException("invallid gender");
        }		
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", gender='" + getGender() + "'" +
            "}";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Hallvard Trætteberg");
		person.setEmail("hallvard.trætteberg@ntnu.no");
		person.setGender('M');
		System.out.println(person.toString());
    }

}