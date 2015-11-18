SECTION = "devel/chicken"
DESCRIPTION = "Module introspection"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://introspect.meta;md5=90250b35494f7f2730d9820d49038678"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/introspect/introspect-${PV}.tar.gz"

SRC_URI[md5sum] = "c3267a7d3ab11beddf100ece9ab390b5"
SRC_URI[sha256sum] = "09738d7efd8afe2b37acdf2f2fbd6e7093a71c5e843e3a567bdf9a2aa169f9c1"

S = "${WORKDIR}/introspect-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
