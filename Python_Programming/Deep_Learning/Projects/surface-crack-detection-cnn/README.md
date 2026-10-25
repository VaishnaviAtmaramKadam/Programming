# Surface Crack Detection using CNN

An AI-based system that detects cracks on industrial surfaces from images using a **Convolutional Neural Network (CNN)**. The model performs **binary classification** and labels each image as **Crack** or **No Crack**. It is built with TensorFlow and Keras.

## Features

- Automatic train / validation / test split (70% / 15% / 15%)
- Image preprocessing: resizing to 128 x 128 and pixel normalization
- Data augmentation: rotation, zoom, shifts and horizontal flip
- 4-block CNN with Batch Normalization, MaxPooling and Dropout
- Training callbacks: Early Stopping, Model Checkpoint, Learning Rate Reduction
- Evaluation with accuracy, confusion matrix and classification report
- Visualization of accuracy and loss graphs
- Single image prediction

## Tech Stack

Python, TensorFlow, Keras, NumPy, Matplotlib, Scikit-learn

## Model Architecture

```
Input (128 x 128 x 3)
  -> [Conv2D(32)  -> BatchNorm -> MaxPooling]
  -> [Conv2D(64)  -> BatchNorm -> MaxPooling]
  -> [Conv2D(128) -> BatchNorm -> MaxPooling]
  -> [Conv2D(256) -> BatchNorm -> MaxPooling]
  -> Flatten
  -> Dense(256, ReLU) -> Dropout(0.5)
  -> Dense(128, ReLU) -> Dropout(0.3)
  -> Dense(1, Sigmoid)
```

- **Loss:** Binary Crossentropy
- **Optimizer:** Adam
- **Metric:** Accuracy

## Dataset

The full dataset is not included in this repository because of its size.

- **Download:** [ADD DATASET LINK HERE]
- After downloading, place it next to the script in this structure:

```
CrackDataset/
├── Positive/    # images with cracks
└── Negative/    # images without cracks
```

A few sample images are available in the `sample_images/` folder for a quick look.

## Project Structure

```
surface-crack-detection-cnn/
├── crack_detection_cnn.py
├── requirements.txt
├── README.md
├── results/              # accuracy graph, loss graph, sample images
└── sample_images/        # a few demo images
```

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/surface-crack-detection-cnn.git
   cd surface-crack-detection-cnn
   ```
2. (Optional) Create and activate a virtual environment:
   ```bash
   python -m venv venv
   venv\Scripts\activate        # Windows
   source venv/bin/activate     # macOS / Linux
   ```
3. Install the dependencies:
   ```bash
   pip install -r requirements.txt
   ```
4. Download the dataset and place it as `CrackDataset/` (see the Dataset section).
5. Run the program:
   ```bash
   python crack_detection_cnn.py
   ```

The script splits the data, trains the model, shows the graphs, evaluates it on the test set and predicts on one sample image. The trained models are saved as `Best_Crack_Detection_Model.keras` and `Final_Crack_Detection_Model.keras`.

## Results

Results on the full dataset:

| Metric | Value |
|---|---|
| Test Accuracy | [ADD VALUE]% |
| Test Loss | [ADD VALUE] |

**Accuracy graph**

![Accuracy Graph](results/accuracy_graph.png)

**Loss graph**

![Loss Graph](results/loss_graph.png)

**Sample training images**

![Sample Images](results/sample_images.png)

## Future Improvements

- Use transfer learning (for example MobileNet or ResNet) for higher accuracy
- Build a simple web interface for uploading and testing images
- Highlight the exact crack location using Grad-CAM or object detection

## Author

**Vaishnavi Kadam**
[GitHub](https://github.com/VaishnaviAtmaramKadam) | [LinkedIn](https://linkedin.com/in/vaishnavi-kadam-111731379)
