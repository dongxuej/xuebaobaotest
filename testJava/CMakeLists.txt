function(CREATE_DIR_IF_NOT arg)
    if(NOT EXISTS ${ARGV0})
        file(MAKE_DIRECTORY ${ARGV0})
    endif()
endfunction()

set(HELP_TARGET msss)

set(CC javac)
set(JAR jar)
set(FIND find)
set(DIR ${CMAKE_CURRENT_SOURCE_DIR}/dir)
set(SRC_LIST_TMP_NAME src_list.txt)
set(DES_DIR ${CMAKE_CURRENT_SOURCE_DIR}/bin)
set(SRC_LIST_PATH ${DES_DIR}/${SRC_LIST_TMP_NAME})
set(MANIFEST ${CMAKE_CURRENT_SOURCE_DIR}/src/META-INF/MANIFEST.MF)
set(M_JAR_NAME teset.jar)

message(STATUS "the CMAKE_CURRENT_SOURCE_DIR is ${CMAKE_CURRENT_SOURCE_DIR}")

CREATE_DIR_IF_NOT(${DES_DIR})


add_library(${HELP_TARGET} SHARED main.c)

add_custom_command(TARGET ${HELP_TARGET}
        #POST_BUILD
        PRE_BUILD
        COMMAND ${FIND} ${CMAKE_CURRENT_SOURCE_DIR} -name "*.java" > ${SRC_LIST_PATH}
        COMMAND ${CC} -d ${DES_DIR} @${SRC_LIST_PATH}
        COMMAND ${JAR} cvfm ${M_JAR_NAME} ${MANIFEST} -C ${DES_DIR} .
        COMMAND mv ${M_JAR_NAME} ${CMAKE_BINARY_DIR}/
        COMMAND rm -rf  ${DES_DIR}
        COMMAND echo "completed gen ${M_JAR_NAME}"
        )
