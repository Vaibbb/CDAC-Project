import '../welcome/Welcome.css'
import sprintservice from '../../../services/Sprintservice'
import React,{useState,useEffect} from 'react'
import Sprint1 from '../../../services/Sprint1'
import { Outlet,Link} from 'react-router-dom'
import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';


const Welcome = ()=>{

  const [sparray,setsparray] = useState([]);
  const [change,setchng] = useState(0);
  const [show,setsh] = useState('');

  const [pid,setpid] = useState(0);

  const navigate = useNavigate();  

 

/*   useEffect(()=>{
    var id=1;
    sprintservice.getAllsprints(id).then(Response => {
      console.log(Response.data);
      setsparray(Response.data);
    })
  },[change]); */

  useEffect(()=>{
    const sprintarray = [new Sprint1('Marketing','Sales',3,'11/3/2024',15,20),
    new Sprint1('Budget_Planning','Finance',2,'11/3/2024',15,20),    new Sprint1('Hiring','HR',1,'11/3/2024',15,20)];
    console.log(sprintarray);
    setsparray(sprintarray);
  },[])

  /* const changearr = ()=>{
    setchng(change+1)
    console.log(change)
  }
    var id=1;
    sprintservice.getAllsprints(id).then(Response => {
      console.log(Response.data);
      setsparray(Response.data);
    })
  },[]); */

  useEffect(()=>{
    var id=1;
    sprintservice.getAllsprints(id).then(Response => {
      console.log(Response.data);
      setsparray(Response.data);
    })
  },[change]);

  const changearr = ()=>{
    setchng(change+1)
    console.log(change)
  }

  const HandleView = ()=>{
    navigate('/sprint/sprintview');
  };

  const Handleadd = () =>{
    navigate('/sprint/addform');
  };

  const deletesprint = (id) =>{
    sprintservice.deletesprint(id).then(Response =>{
    setsh(Response.data)
    }).catch(Error =>{
    console.log(Error)
    });
  };

  const updatesprint = (sprint) =>{
    sprintservice.updatesprint(sprint).then(Response =>{
      setsh(Response.data)
      }).catch(Error =>{
      console.log(Error)
      });
  }


    return (
        <div>
            <div className="container-fluid" id='Innercontainer'>
                <div className='row align-items-start' id='row'>
                    <div className='col-2' id='Dashboard'>
                    <nav class="vertical-nav">
                      <ul>
                        <li><button><a onClick={Handleadd} change={changearr}> Add a Sprint</a></button></li>
                        <br></br>
                        <br></br>
                        <li><a href="http://localhost:3000/home">Logout</a></li>
                        <br></br>
                        <li><a href="http://localhost:3000/home">Home</a></li>
                        <br></br>
                        <li><a href="http://localhost:3000/home">Back</a></li>
                        </ul>
                    </nav>

                    </div>
                    <div className="col-10" id='Sprint_space'>
                      <h2>Welcome Manager name !</h2>
                      <h6> Here are your sprints , if you dont have one then create one by clicking add a sprint</h6>
                      <h6>{show}</h6>
                      <br></br>
                      <br></br>
                      <div className='container-fluid' id='sprintcontainer'>
                        <div className='row' style={{ height: '100%' }}> 
                        {sparray.map((sprint) => (
                          <div className='col-3' id='spintcolumn' key={sprint.id}>
                              <div >
                              <p>{sprint.name}</p>
                              {/* Other product details */}
                              <ul>
                                <li className='inner'>Domain :{sprint.domain}</li>
                                <br></br>
                                <li className='inner'>Priority :{sprint.priority}</li>
                                <br></br>
                                <li className='inner'>Deadline :{sprint.deadline}</li>
                                <br></br>
                                <li className='inner'>No of Employees :{sprint.no_of_employees}</li>
                                <br></br>
                                <div><button onClick={HandleView}>View</button></div>&nbsp;&nbsp;&nbsp;&nbsp;
                                <div><button onClick={updatesprint(sprint)}>Update</button></div>
                                <div><button onClick={deletesprint(sprint.id)}>Delete</button></div>

                              </ul>
                              </div>
                          </div>
                          ))}
                        </div>

                      </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Welcome;