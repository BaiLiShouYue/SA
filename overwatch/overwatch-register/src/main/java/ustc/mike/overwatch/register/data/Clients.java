/*******************************************************************************
 * Copyright © 2016 TangDongxin
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 ******************************************************************************/

package ustc.mike.overwatch.register.data;

import ustc.mike.overwatch.common.data.Client;
import ustc.mike.overwatch.common.data.Data;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Mike
 * @project overwatch
 * @date 08/12/2017, 11:39 AM
 * @e-mail mike@mikecoder.cn
 */
public class Clients extends Data {
    
    private volatile ConcurrentHashMap<String, Client> clients = new ConcurrentHashMap<String, Client>();
    
    /**
     * Getter for property 'clients'.
     *
     * @return Value for property 'clients'.
     */
    public ConcurrentHashMap<String, Client> getClients() {
        return clients;
    }
    
    /**
     * Setter for property 'clients'.
     *
     * @param clients Value to set for property 'clients'.
     */
    public void setClients(
            ConcurrentHashMap<String, Client> clients)
    {
        this.clients = clients;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Clients clients1 = (Clients) o;
        
        return clients != null ? clients.equals(clients1.clients) : clients1.clients == null;
    }
    
    @Override
    public int hashCode() {
        return clients != null ? clients.hashCode() : 0;
    }
}
