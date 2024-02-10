import React from 'react'
import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom';
import HomeComponent from './components/HomeComponent/HomeComponent'
import "bootstrap/dist/css/bootstrap.min.css"
import Form from './components/Form/Form'
import Register from './components/Register/Register'
import Sprint from './components/Sprint/Sprint'
import Welcome from './components/Sprint/welcome/Welcome'

function App() {
  return (
    <BrowserRouter>
        <Routes>
          <Route path="/" element={<Navigate replace to="/home" />} />
          <Route path="/home" element={<HomeComponent />} >
              <Route path='/home' element={<Form />}></Route>
              <Route path='/home/register' element={<Register/>}></Route>
          </Route>
          <Route path='/sprint' element={<Sprint/>}>
              <Route path='/sprint' element={<Welcome/>}></Route>
          </Route>
        </Routes>
    </BrowserRouter>
  )
}

export default App