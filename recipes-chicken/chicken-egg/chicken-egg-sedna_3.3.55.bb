SECTION = "devel/chicken"
DESCRIPTION = "An interface to the Sedna XML database management system."
LICENSE = "Apache-1.0"
LIC_FILES_CHKSUM = "file://sedna.meta;md5=a9b321639393c83fe217d6546abdaf13"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sedna/sedna-${PV}.tar.gz"

SRC_URI[md5sum] = "40708d5e329cf35ddfb8abc20d2b157a"
SRC_URI[sha256sum] = "f49ae0ccc9edbf94990a4835d050a92fdf25580bd86b453c53d9cfbec83136f6"

S = "${WORKDIR}/sedna-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
