SECTION = "devel/chicken"
DESCRIPTION = ""
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://scsh-process.meta;md5=d650e4d4b060d858a215b9090acefc24"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/scsh-process/scsh-process-${PV}.tar.gz"

SRC_URI[md5sum] = "38869b9c257aa59dce1586f2f59114ec"
SRC_URI[sha256sum] = "e8fc8dc71e8f7553b3d337f37196cf0a90445302a15ec530b8939dd17ebf3f36"

S = "${WORKDIR}/scsh-process-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
