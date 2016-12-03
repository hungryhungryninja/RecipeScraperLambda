# Recipe Scraper

This is an AWS Lambda that accepts a url as input and returns a recipe in json format as output. It will go to the url passed in and parse the receipe on the page. It then converts it to json to return the API Gatewat.

## Installation

This is a maven project. To build, run: `mvn package shade:shade`

## Usage

It uses the shade plugin to package up all dependencies and compiled code into a single jar/zip

To deploy to AWS, manually copy the jar into the Lambda or, use the eclipse AWS sdk to upload the Lambda.

To test, right click the project and run as junit test.

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## License

GNU General Public License
https://www.gnu.org/licenses/gpl-3.0.en.html