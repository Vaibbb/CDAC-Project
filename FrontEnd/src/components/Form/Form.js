import React from 'react'
import './Form.css'
import { Outlet,Link, Navigate} from 'react-router-dom'
import ManagerService from '../../services/ManagerService'
import {useState,useEffect} from 'react';
import { useNavigate } from 'react-router-dom';



const Form = ()=>{

    const [email,setemail] = useState('');
    const [password,setpassword] = useState('');   
    const navigate = useNavigate();  
 

    const Handlelogin = ()=>{
        if(email !== '' && password !== '')
        console.log(email,password);
        var man=ManagerService.getByName(email,password).then(response =>{
            console.log(response.data);
           // if(response.data.email==email)
            navigate('/sprint');
        });

    }

    return(
        <div>
            <div class="wrapper">
                <h1>Hello Again!</h1>
                <p>Welcome back you've been missed</p>
                    <form>
                    <input type="text" placeholder="Enter username" onChange={e=>setemail(e.target.value)}></input>
                        <input type="password" placeholder="Password" onChange={e=>setpassword(e.target.value)}></input>
                    </form>
                    
                    
                <button onClick={Handlelogin}>Sign in</button>
                <div class="not-member">
                Not a member?   <Link to="/home/register"> Register Now </Link>
                </div>
            </div>
        </div>
    )
}

export default Form;
