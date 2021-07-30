import { useState, useEffect } from "react";
function App() {
  const [quizData, setQuizData] = useState([]);
  useEffect(() => {
    fetch("http://localhost:8080/quiz").then((result) => {
      result.json().then((resp) => {
        // console.log("result",resp)
        setQuizData(resp);
        // console.log(resp.jso1.quiz[0])
      });
    });
  }, []);
  return (
    <div>
      <pre>{JSON.stringify(quizData, null, 2)}</pre>
    </div>
  );
}

export default App;
