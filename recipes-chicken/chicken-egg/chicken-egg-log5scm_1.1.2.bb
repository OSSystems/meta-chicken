SECTION = "devel/chicken"
DESCRIPTION = "Logging library based on Common Lisp's log5"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://log5scm.meta;md5=5e7b881da23e48ce3f5757bb73eb9e80"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross chicken-egg-syslog-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk chicken-egg-syslog-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-syslog chicken-egg-defstruct-crosssdk chicken-egg-syslog-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-syslog chicken-egg-defstruct-cross chicken-egg-syslog-cross chicken-egg-log5scm-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct chicken-egg-syslog"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/log5scm/log5scm-${PV}.tar.gz"

SRC_URI[md5sum] = "4bc0ce1cf068afc0a506b13c00f76b87"
SRC_URI[sha256sum] = "414f314c2e328bad0f22131adff074aa70771e7b5b84168029426c49e38fbd8b"

S = "${WORKDIR}/log5scm-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
