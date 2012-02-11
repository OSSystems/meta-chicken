SECTION = "devel/chicken"
DESCRIPTION = "Generates bindings from C/C++ declarations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://easyffi.meta;md5=e4f46d276dad9db51692aac2f118f96d"
DEPENDS_virtclass-cross += "chicken-egg-silex-cross chicken-egg-matchable-cross chicken-egg-regex-cross"
DEPENDS += "chicken-egg-silex chicken-egg-matchable chicken-egg-regex chicken-egg-silex-cross chicken-egg-matchable-cross chicken-egg-regex-cross"
RDEPENDS += "chicken-egg-silex chicken-egg-matchable chicken-egg-regex"

inherit chicken_install

BBCLASSEXTEND = "cross"
