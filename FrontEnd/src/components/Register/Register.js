import React from 'react'
import './Register.css'
import { Outlet,Link} from 'react-router-dom'
import {useState,useEffect} from 'react';
import Manager from  '../../services/Manager'
import Service from '../../services/ManagerService'



const Form = ()=>{

    const[position,setpos]= useState('');
    const[name,setname]= useState('');
    const[salary,setsal]= useState('');
    const[email,setemail]= useState('');
    const[password,setpass]= useState('');
    const[show,setshow] = useState('');

    const HandleRegister = ()=>{
        let man = new Manager(position,email,name,'2024-02-14','',password,salary);
        console.log(man);
        let manadded = Service.insertManager(man).then((result)=>{
            console.log(result.data);
            if(result.data!=undefined)
            setshow('Manager has been added')
           }).catch((Error)=>{
            console.log(Error)
           }
           );
    };


    return(
        <div>
            <div class="wrapper">
                <h1>Hello Again!</h1>
                <p>Enter all your details</p>
                    <form>
                    <input type="text" placeholder="Position (ASSOCIATE, JUNIOR , SENIOR , DIRECTOR)" onChange={e=>setpos(e.target.value)}></input>
                    <input type="text" placeholder="First name" onChange={e=>setname(e.target.value)}></input>
                    <input type="text" placeholder="Salary" onChange={e=>setsal(e.target.value)}></input>
                    <input type="text" placeholder="Email"onChange={e=>setemail(e.target.value)}></input>
                    <input type="password" placeholder="Enter a Password" onChange={e=>setpass(e.target.value)}></input>
                    </form>
                    
                    
                <button onClick={HandleRegister}>Register</button>
                {show}
            </div>
        </div>
    )
}

export default Form;
