function fetchQuestions() {
    console.log('Attempting to fetch questions');
    fetch('questions.json')
      .then(response => {
        if (!response.ok) {
          throw new Error(`HTTP error! status: ${response.status}`);
        }
        return response.json();
      })
      .then(questions => {
        console.log('Questions fetched successfully', questions);
        setupQuestionnaire(questions);
      })
      .catch(error => console.error('Error loading questions:', error));
  }
  
  function setupQuestionnaire(questions) {
    const container = document.getElementById('questions-container');
  
    questions.forEach((q, index) => {
      const questionSection = document.createElement('div');
      questionSection.classList.add('question-section', 'hidden');
      questionSection.id = `question${index + 1}`;
  
      const questionText = document.createElement('p');
      questionText.classList.add('question');
      questionText.textContent = q.question;
  
      const answersDiv = document.createElement('div');
      answersDiv.classList.add('answers');
  
      q.answers.forEach(answer => {
        const answerButton = document.createElement('button');
        answerButton.classList.add('answer-button');
        answerButton.textContent = answer;
        answerButton.dataset.answer = answer;
        answersDiv.appendChild(answerButton);
      });
  
      const nextButton = document.createElement('button');
      nextButton.classList.add('next-button');
      nextButton.textContent = 'Next';
  
      questionSection.appendChild(questionText);
      questionSection.appendChild(answersDiv);
      questionSection.appendChild(nextButton);
  
      container.appendChild(questionSection);
    });
  
    addEventListeners();
  }
  
  function addEventListeners() {
    const startButton = document.getElementById('start-button');
    if (startButton) {
      startButton.addEventListener('click', function() {
        document.getElementById('welcome-section').classList.add('hidden');
        const firstQuestion = document.getElementById('question1');
        if (firstQuestion) {
          firstQuestion.classList.remove('hidden');
        } else {
          console.error('First question section not found');
        }
      });
    } else {
      console.error('Start button not found');
    }
  
    document.querySelectorAll('.next-button').forEach((button, index, buttons) => {
      button.addEventListener('click', function() {
        const currentSection = document.getElementById(`question${index + 1}`);
        const nextSection = document.getElementById(`question${index + 2}`);
        if (currentSection) {
          currentSection.classList.add('hidden');
        }
        if (nextSection) {
          nextSection.classList.remove('hidden');
        } else if (index + 1 === buttons.length) {
          console.log('End of the questionnaire');
        }
      });
    });
    
  
    document.querySelectorAll('.answer-button').forEach(button => {
      button.addEventListener('click', function() {
        // remove 'selected' from all buttons in this answer group
        this.parentElement.querySelectorAll('.answer-button').forEach(btn => {
          btn.classList.remove('selected');
        });
        this.classList.add('selected');
        // You may want to store the selected answer or perform some action
      });
    });
  }
  
  document.addEventListener('DOMContentLoaded', () => {
    fetchQuestions();
  });
  