SECTION = "devel/chicken"
DESCRIPTION = "Blowfish"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://blowfish.meta;md5=4f342ed051f9654831f6b99ab6056539"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/blowfish/blowfish-${PV}.tar.gz"

SRC_URI[md5sum] = "cfc616b78f97df7f985223c6c9e78814"
SRC_URI[sha256sum] = "ba62f4d664a1fff6fc310d77e0fbec36ecd162411861db7820a06a814044e792"

S = "${WORKDIR}/blowfish-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
