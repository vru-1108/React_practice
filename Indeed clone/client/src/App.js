import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
import Home from './pages/Home';
import {BrowserRouter as Router,Routes,Route} from 'react-router-dom';
import CreatePost from './pages/CreatePost';
import { routePath } from './routes/route';
function App() {
  return (
  <Router>
    <Routes>
      <Route path={routePath.home} element={<Home />}></Route>
      <Route path={routePath.create} element={<CreatePost />}></Route>
    </Routes>

  </Router>
  );
}

export default App;
