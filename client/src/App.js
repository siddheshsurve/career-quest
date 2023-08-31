import './App.css';
import CreatePost from './pages/CreatePost';
import Home from './pages/Home';
import {BrowserRouter as Router, Routes, Route, BrowserRouter} from "react-router-dom"
import { routePath } from './routes/route';

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path={routePath.home} element={<Home />} ></Route>
          <Route path={routePath.create} element={<CreatePost />} ></Route>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
