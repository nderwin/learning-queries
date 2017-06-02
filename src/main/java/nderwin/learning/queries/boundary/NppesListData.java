/*
 * Copyright 2017 Nathan Erwin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nderwin.learning.queries.boundary;

import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nderwin
 */
@XmlRootElement
public class NppesListData implements Serializable {

    @XmlElement(name = "NPI")
    private final String npi;
    
    @XmlElement
    private final String companyName;
    
    @XmlElement
    private final String firstName;
    
    @XmlElement
    private final String lastName;

    public NppesListData(final String npi, final String companyName, final String firstName, final String lastName) {
        this.npi = npi;
        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNpi() {
        return npi;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.npi);
        return hash;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NppesListData other = (NppesListData) obj;
        return Objects.equals(this.npi, other.npi);
    }
    
}
