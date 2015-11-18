SECTION = "devel/chicken"
DESCRIPTION = "FFI convenience macro"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://dollar.meta;md5=963715a948947a17c762f1037b777192"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dollar/dollar-${PV}.tar.gz"

SRC_URI[md5sum] = "a336d5217c057da56a8b184fb175bf45"
SRC_URI[sha256sum] = "acbd69bcd15d8ab9e57d6b5e349ba022d0f1afec5a511c208d73f077e087d8f8"

S = "${WORKDIR}/dollar-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
