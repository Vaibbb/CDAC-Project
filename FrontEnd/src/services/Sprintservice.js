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
       return axios.get(baseUrl + "/Sprint" + "/man/" + manid);
    }


 

}

export default new Sprintservice();