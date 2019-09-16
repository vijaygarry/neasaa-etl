build_version=0.1
componentName=neasaa-etl-tool
mainToolClass=com.neasaa.etl.ETLTool

# Start the component/tools

classpath=../lib/*:../config
# add option that generated heap dump on oom error
java_options="-XX:+HeapDumpOnOutOfMemoryError"
java_command="java ${java_options} -classpath ${classpath} ${mainToolClass}"
echo "Starting ${componentName} using command : ${java_command} $@"

${java_command} "$@" &
