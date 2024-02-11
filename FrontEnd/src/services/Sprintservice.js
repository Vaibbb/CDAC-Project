import Sprint1 from './Sprint1'
import axios from 'axios';
const baseUrl="http://localhost:9090/Login"

class Sprintservice{
    
    constructor(){
        this.sprintarr=[new Sprint1('Marketing','Sales',3,'11/3/2024',15,20),
        new Sprint1('Budget_Planning','Finance',2,'11/3/2024',15,20),
        new Sprint1('Hiring','HR',1,'11/3/2024',15,20)];
    }
    getAllsprints(){
        console.log(this.sprintarr)
        return this.sprintarr;
       // return axios.get(baseUrl);
       //return axios.get("http://localhost:8282/products")
    }

/* 
    insertProduct(product){
        console.log("in service add")
       //this.prodarr.push(product);
       //console.log(this.prodarr);
       return axios.post(baseUrl+"/product/"+product.pid,product)//,{header:{"content-type":"application/json",autherization:"bearer"+<localStorage.jwttoken>}})
    }

    deleteproduct(pid){
       // let pos=this.prodarr.findIndex(p=>p.pid==pid);
       // this.prodarr.splice(pos,1);
       return axios.delete(baseUrl+"/product/"+pid)
    }*/
 /*    getByName(name,password){
        if(name!=undefined && password!=undefined){
       let man= this.manarr.find(manager=>manager.name===name);
       if(man.password === password)
       return man;
        }
       //return axios.get(baseUrl+"/product/"+id)
    } */
    /* 
    updateproduct(prod){
        //let pos=this.prodarr.findIndex(p=>p.pid==prod.pid);
       // this.prodarr.splice(pos,1,{...prod});
       return axios.put(baseUrl+"/product/"+prod.pid,prod)//,{header:{"content-type":"application/json",autherization:"bearer"+<localStorage.jwttoken>}})
    } */

}

export default new Sprintservice();