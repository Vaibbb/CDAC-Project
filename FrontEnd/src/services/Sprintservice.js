import Sprint1 from './Sprint1'
import axios from 'axios';
const baseUrl="http://localhost:7070"

class Sprintservice{
    
    constructor(){
        this.sprintarr=[new Sprint1('Marketing','Sales',3,'11/3/2024',15,20),
        new Sprint1('Budget_Planning','Finance',2,'11/3/2024',15,20),
        new Sprint1('Hiring','HR',1,'11/3/2024',15,20)];
    }
    getAllsprints(manid){
        console.log(manid);
       return axios.get(baseUrl + "/Sprint" + "/man/" + manid);
    }


    insertsprint(sprint){
        console.log("in service add" + sprint)
       return axios.post(baseUrl +'/Sprint', sprint, {
        headers: {
            'Content-Type': 'application/json'
        }
    })
    //,{header:{"content-type":"application/json",autherization:"bearer"+<localStorage.jwttoken>}})
    }

    deletesprint(pid){
        return axios.delete(baseUrl+"/Sprint/"+pid)
     }

     updatesprint(sprint){
       console.log(sprint)
       return axios.put(baseUrl+"/Sprint" , sprint )//,{header:{"content-type":"application/json",autherization:"bearer"+<localStorage.jwttoken>}})
    }

}

export default new Sprintservice();