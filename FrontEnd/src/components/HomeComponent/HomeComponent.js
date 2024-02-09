import React from 'react'
import "bootstrap/dist/css/bootstrap.min.css"
import '../HomeComponent/HomeComponent.css'
import Employee from '../../images/Employees.jpg'
import logo from '../../images/Logo2.jpg'
import Form from '../Form/Form.js'


const HomeComponent = (props)=>{
    

    return(
        <div className='container-full' id='Homecom'>
            <div className='container' id='innercont'>
                <div class="row justify-content-md-center">
                    <div className='col 12'>
                        <h6 id='title'>Sprint Manager</h6>
                    </div>
                </div>
                <div className='row justify-content-md-center' id='row2'>
                </div>
                <div className='row justify-content-md-center'>
                    <div className='col 12'>
                        <Form></Form>
                    </div>
                </div>
            </div>    
        </div>
    )
}


export default HomeComponent;