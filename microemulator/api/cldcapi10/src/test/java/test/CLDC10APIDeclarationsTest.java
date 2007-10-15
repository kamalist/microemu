/**
 *  MicroEmulator
 *  Copyright (C) 2006-2007 Bartek Teodorczyk <barteo@barteo.net>
 *  Copyright (C) 2006-2007 Vlad Skarzhevskyy
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *  @version $Id$
 */
package test;

import net.sf.jour.signature.APICompareConfig;
import net.sf.jour.signature.SignatureTestCase;

/**
 * @author vlads
 *
 */
public class CLDC10APIDeclarationsTest extends SignatureTestCase {

    public String getAPIPath() {
        return "./target/classes";
    }

    public boolean isUeSystemClassPath() {
        return false;
    }

    public APICompareConfig getAPICompareConfig() {
        APICompareConfig c = new APICompareConfig();
        c.allowPackageAPIextension = false;
        return c;
    }
    
    public String getSignatureXMLPath() {
        return "cldcapi10-signature.xml";
    }

}
