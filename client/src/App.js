import './App.css';
import CreatePost from './pages/CreatePost';
import Home from './pages/Home';
import {BrowserRouter as Router, Routes, Route, BrowserRouter} from "react-router-dom"

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path='/' element={<Home />} ></Route>
          <Route path='/create' element={<CreatePost />} ></Route>
          
        </Routes>
      </Router>
    </div>
  );
}

export default App;
