SECTION = "devel/chicken"
DESCRIPTION = "Generates bindings from C/C++ declarations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://easyffi.meta;md5=e4f46d276dad9db51692aac2f118f96d"
DEPENDS_virtclass-cross += "chicken-egg-silex-cross chicken-egg-matchable-cross chicken-egg-regex-cross"
DEPENDS += "chicken-egg-silex chicken-egg-matchable chicken-egg-regex chicken-egg-silex-cross chicken-egg-matchable-cross chicken-egg-regex-cross"
RDEPENDS_${PN} += "chicken-egg-silex chicken-egg-matchable chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "b63cb4c22e8593f9b097a5a9a36cb56d"
SRC_URI[sha256sum] = "8488df7416ec2d56e6b32786e04ecbeb7202e4abff21649ad7341d94d0fec4f7"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
