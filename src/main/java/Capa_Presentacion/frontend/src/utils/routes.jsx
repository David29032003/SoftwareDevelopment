import Home from "../pages/home/Home"
import Login from "../pages/login/Login"
import Register from "../pages/register/Register"
import Game from "../pages/game/Game"
export const routes = [
    {
        id: 1,
        path: "/",
        element: <Home/>,
     },
     {
         id: 2,
         path: "/login",
         element: <Login/>
     },
     {
         id: 3,
         path: "/register",
         element: <Register/>
     },
    {
        id: 4,
        path: "/game",
        element: <Game/>
    }
    
]