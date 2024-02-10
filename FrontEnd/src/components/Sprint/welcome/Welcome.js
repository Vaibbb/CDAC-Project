import '../welcome/Welcome.css'

const Welcome = ()=>{
    return (
        <div>
            <div className="container-fluid" id='Innercontainer'>
                <div className='row align-items-start' id='row'>
                    <div className='col-2' id='Dashboard'>
                    <nav class="vertical-nav">
                      <ul>
                        <li><button>Add a Sprint</button></li>
                        <br></br>
                        <br></br>
                        <li><a href="#">Search</a></li>
                        <br></br>
                        <li><a href="#">Home</a></li>
                        <br></br>
                        <li><a href="#">Back</a></li>
                        </ul>
                    </nav>

                    </div>
                    <div className="col-10" id='Sprint_space'>
                      <h2>Welcome Manager name !</h2>
                      <h6> Here are your sprints , if you dont have one then create one by clicking add a sprint</h6>
                      <br></br>
                      <br></br>
                      <div className='container-fluid' id='sprintcontainer'>
                        <div className='row'> 
                          <div className='col-3'>

                          </div>
                        </div>

                      </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Welcome;