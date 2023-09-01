import './App.css';
import CreatePost from './pages/CreatePost';
import Home from './pages/Home';
import {BrowserRouter as Router, Routes, Route, BrowserRouter} from "react-router-dom"
import { routePath } from './routes/route';
import AllPost from './pages/AllPost';

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path={routePath.home} element={<Home />} ></Route>
          <Route path={routePath.create} element={<CreatePost />} ></Route>
          <Route path={routePath.posts} element={<AllPost />} ></Route>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
